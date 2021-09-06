def listsOfMachine(Map config = [:]) {
  //GET
  def connection = new URL("http://54.36.230.136:2000/api/machine/list").openConnection(); 
  connection.setRequestMethod("GET");
  connection.doOutput = false;
  connection.connect();
  println(connection.content.text);
}

def statusOfMachine(Map config = [:]) {
  // GET
  def connection = new URL("http://54.36.230.136:2000/api/machine/status/test1").openConnection(); 
  connection.setRequestMethod("GET");
  connection.doOutput = false;
  connection.connect();
  println(connection.content.text);
}

def createMachine(Map config = [:]) {
  //POST
  try {
	  echo "1"
	  def post = new URL("54.36.230.136:2000/api/machine/create/test4?config=test-infra").openConnection();
	  echo "2"
	  def message = '{"message":"this is a message"}'
    `	  echo "3"
	  post.setRequestMethod("POST")
	  echo "4"
	  post.setDoOutput(true)
	  echo "5"
	  post.setRequestProperty("Content-Type", "application/json")
	  echo "6"
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  echo "7"
	  def postRC = post.getResponseCode();
	  echo "8"
	  println(postRC);
	  if(postRC.equals(200)) {
	    println("Machine is being created.");
	  }  else {
	  	println("Machin cannot be created!")
	  }
	} catch (Exception ex) {
		println("Catching the exception");
		 println(ex.toString());
         println(ex.getMessage());
	}
}

def post(Map config = [:]) {
  // POST
  def post = new URL("http://localhost:8012/anything/srijal").openConnection();
  def message = '{"message":"this is a message"}'
  post.setRequestMethod("POST")
  post.setDoOutput(true)
  post.setRequestProperty("Content-Type", "application/json")
  post.getOutputStream().write(message.getBytes("UTF-8"));
  def postRC = post.getResponseCode();
  println(postRC);
  if(postRC.equals(200)) {
    println(post.getInputStream().getText());
  }  
}
