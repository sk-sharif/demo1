def add(x){
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
