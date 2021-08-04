def add(x){
   script {
      sh "${x}"
   sh '''
      echo "${x}"
      echo '${x}'
      echo "x"
      echo 'x'
      echo "$x"
      echo '$x'
      "echo \${x}"
   '''
   }
}
