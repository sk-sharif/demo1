import groovy.json.*;
def listsOfMachine(Map config = [:]) {
    def http = new HTTPBuilder( 'http://ajax.googleapis.com' )

// perform a GET request, expecting JSON response data
http.request( GET, JSON ) {
  uri.path = '/ajax/services/search/web'
  uri.query = [ v:'1.0', q: 'Calvin and Hobbes' ]

  headers.'User-Agent' = 'Mozilla/5.0 Ubuntu/8.10 Firefox/3.0.4'

  // response handler for a success response code:
  response.success = { resp, json ->
    println resp.statusLine

    // parse the JSON response object:
    json.responseData.results.each {
      println "  ${it.titleNoFormatting} : ${it.visibleUrl}"
    }
  }
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
	  def post = new URL("http://54.36.230.136:2000/api/machine/create/test2?config=test-infra").openConnection();
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
	  def post = new URL("http://54.36.230.136:2000/api/machine/start/test2").openConnection();
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
	  def post = new URL("http://54.36.230.136:2000/api/machine/update/test2").openConnection();
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
	  def post = new URL("http://54.36.230.136:2000/api/machine/stop/test2").openConnection();
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
