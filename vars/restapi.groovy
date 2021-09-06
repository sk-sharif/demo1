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
	  def post = new URL("http://54.36.230.136:2000/api/machine/create/test6?config=test-infra").openConnection();
	  def message = '{"message":"this is a message"}'
	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
	  if(postRC.equals(200)) {
	    println("Machine is being created.");
	  }  else {
	  	println("Machine cannot be created!")
	  }
	} catch (Exception ex) {
		println("Catching the exception");
		 println(ex.toString());
         println(ex.getMessage());
	}
}

def startMachine(Map config = [:]) {
  //POST
	try {
	  def post = new URL("http://54.36.230.136:2000/api/machine/start/test6").openConnection();
	  def message = '{"message":"this is a message"}'
    	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
	  if(postRC.equals(200)) {
	    println("Machine is Started.");
	  }  else {
	  	println("Machine is cannot be Started!")
	  }
	} catch (Exception ex) {
		println("Catching the exception");
		 println(ex.toString());
         println(ex.getMessage());
	}
}


def updateMachine(Map config = [:]) {
  //POST
	try {
	  def post = new URL("http://54.36.230.136:2000/api/machine/update/test1").openConnection();
	  def message = '{"message":"this is a message"}'
    	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
	  if(postRC.equals(200)) {
	    println("Machine is Updated.");
	  }  else {
	  	println("Machine is cannot Updated!")
	  }
	} catch (Exception ex) {
		println("Catching the exception");
		 println(ex.toString());
         println(ex.getMessage());
	}
}

def stopMachine(Map config = [:]) {
  //POST
	try {
	  def post = new URL("http://54.36.230.136:2000/api/machine/stop/test6").openConnection();
	  def message = '{"message":"this is a message"}'
    	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
	  if(postRC.equals(200)) {
	    println("Machine is Stopped.");
	  }  else {
	  	println("Machine is cannot be Stopped!")
	  }
	} catch (Exception ex) {
		println("Catching the exception");
		 println(ex.toString());
         println(ex.getMessage());
	}
}

def post(Map config = [:]) {
  // POST
  def post = new URL("http://54.36.230.136:2000/api/machine/stop/test1").openConnection();
  def message = '{"message":"this is a message"}'
  post.setRequestMethod("POST")
  post.setDoOutput(true)
  post.setRequestProperty("Content-Type", "application/json")
  post.getOutputStream().write(message.getBytes("UTF-8"));
  def postRC = post.getResponseCode();
  println(postRC);
  if(postRC.equals(200)) {
    println("Machine is Stopped.");
  }  
}
