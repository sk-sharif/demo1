def call(Map config = [:]) {
  echo "checking 1"
  def connection = new URL("http://localhost:8012/delay/1").openConnection();
  echo "checking 2" 
  connection.setRequestMethod("GET");
  echo "checking 3"
  connection.doOutput = false;
  echo "checking 4"
  connection.connect();
  echo "checking 5"
  println(connection.content.text);
}

def post(Map config = [:]) {
  // POST
  echo "checking 1"
  def connection = new URL("http://localhost:8012/anything/srijal").openConnection();
  echo "checking 2"
//   def message = '{"message":"this is a message"}'
//   echo "checking 3"
//   post.setRequestMethod("POST")
//   echo "checking 4"
//   post.setDoOutput(true)
//   echo "checking 5"
//   post.setRequestProperty("Content-Type", "application/json")
//   echo "checking 6"
//   post.getOutputStream().write(message.getBytes("UTF-8"));
//   echo "checking 7"
//   def postRC = post.getResponseCode();
//   echo "checking 8"
//   println(postRC);
//   echo "checking 9"
//   if(postRC.equals(200)) {
//     println(post.getInputStream().getText());
//   }
  
  connection.setRequestMethod("POST")
        connection.doOutput = true
        connection.outputStream.withWriter{
            it.write(postContent)
            it.flush()
        }
        connection.connect()

        try {
            println(connection.content.text)
        } catch (IOException e) {
            try {
                ((HttpURLConnection)connection).errorStream.text
            } catch (Exception ignored) {
                throw e
            }
        }
  
}
