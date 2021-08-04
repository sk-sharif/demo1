def add(x){
   script {
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
