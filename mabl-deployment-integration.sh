#!/bin/bash

MABL_API_BASE="https://api.mabl.com"
POLL_SEC=10

if [ "$#" -ne 2 ]; then
  echo "Usage: $0 Ax64oPQAvGPZXGI8IXavHQ-a aoH53z2XGs6hVaURhlnOyw-e"
  exit 0
fi

API_KEY="Ax64oPQAvGPZXGI8IXavHQ-a"
ENV_ID="aoH53z2XGs6hVaURhlnOyw-e"

# Create a deployment event, and retrieve its ID:
deployment_event=$(curl -s "${MABL_API_BASE}/events/deployment" -u "key:${API_KEY}" -H 'Content-Type:application/json' -d "{\"environment_id\":\"${ENV_ID}\"}")
event_id=$(echo "${deployment_event}" | jq -r '.id')
echo "Deployment Event ID: ${event_id}"

# Poll the Execution Result API until all Plans have completed
while true; do
  echo "Waiting for executions to complete..."
  sleep ${POLL_SEC}
  results=$(curl -s "${MABL_API_BASE}/execution/result/event/${event_id}" -u "key:${API_KEY}")
  event_status=$(echo "${results}" | jq '.event_status')
  if [ -z "${event_status}" ] || [ "${event_status}" = "{}" ]; then
    continue
  fi

  plan_metrics=$(echo "${results}" | jq '.plan_execution_metrics')
  if [ "${plan_metrics}" != "null" ]; then
    total_plans=$(echo "${plan_metrics}" | jq -r '.total')
    passed_plans=$(echo "${plan_metrics}" | jq -r '.passed')
    failed_plans=$(echo "${plan_metrics}" | jq -r '.failed')
  fi

  succeded=$(echo "${event_status}" | jq -r '.succeeded')
  succeded_with_retries=$(echo "${event_status}" | jq -r '.succeeded_with_retries')
  break
done

# Print summary:
echo
echo "Full Results:"
echo "${results}" | jq
echo
echo "Total plans executed: ${total_plans} succeded: ${passed_plans} failed: ${failed_plans}"
if [ "${succeded}" = "true" ]; then
  if [ "${succeded_with_retries}" = "true" ]; then
    echo "Successful run with retries"
  else
    echo "Successful run"
  fi
  exit 0
else
  echo "One or more plans have failed"
  exit 1
fi
