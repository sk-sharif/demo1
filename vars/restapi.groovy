@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.0-RC2' )
import groovy.json.*;
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import groovyx.net.http.HTTPBuilder

def listsOfMachine(Map config = [:]) {
  //GET
  def connection = new URL("https://test.imqs.co.za:2000/api/machine/list").openConnection(); 
  connection.setRequestProperty("Authorization", "Basic ${config.auth}");
  connection.setRequestMethod("GET");
  connection.doOutput = false;
  connection.connect();
  def arr = connection.content.text;
  println(arr);
  def parser = new JsonSlurperClassic();
  def json = parser.parseText(arr);
  return json;
}

def statusOfMachine(Map config = [:]) {
  // GET
	try {
  		def connection = new URL("https://test.imqs.co.za:2000/api/machine/status/${config.branch_name}").openConnection(); 
		connection.setRequestProperty("Authorization", "Basic ${config.auth}");
  		connection.setRequestMethod("GET");
  		connection.doOutput = false;
  		connection.connect();
  		println(connection.content.text);
		return connection.content.text;
		
	} catch (Exception ex) {
		println("Catching the exception");
		println(ex.toString());
        	println(ex.getMessage());
	}
}

def createMachine(Map config = [:]) {
  //POST
	echo "${config.branch_name}"
	try {
	  def post = new URL("https://test.imqs.co.za:2000/api/machine/create/${config.branch_name}?config=test-infra").openConnection();
	  post.setRequestProperty("Authorization", "Basic ${config.auth}");
	  def message = '{"message":"this is a message"}'
	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
	  return postRC; 
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
	echo "${config.branch_name}"
	try {
	  def post = new URL("https://test.imqs.co.za:2000/api/machine/start/${config.branch_name}").openConnection();
	  post.setRequestProperty("Authorization", "Basic ${config.auth}");
	  def message = '{"message":"this is a message"}'
    	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
// 	  println(postRC);
          return postRC;
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

def stopMachine(Map config = [:]) {
  //POST
	try {
	  def post = new URL("https://test.imqs.co.za:2000/api/machine/stop/${config.branch_name}").openConnection();
	  post.setRequestProperty("Authorization", "Basic ${config.auth}");
	  def message = '{"message":"this is a message"}'
	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
          return postRC;
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

def updateMachine(Map config = [:]) {
  //POST
	try {
	  def post = new URL("https://test.imqs.co.za:2000/api/machine/update/${config.branch_name}").openConnection();
	  post.setRequestProperty("Authorization", "Basic ${config.auth}");
	  def message = '{"message":"this is a message"}'
    	  post.setRequestMethod("POST")
	  post.setDoOutput(true)
	  post.setRequestProperty("Content-Type", "application/json")
	  post.getOutputStream().write(message.getBytes("UTF-8"));
	  def postRC = post.getResponseCode();
	  println(postRC);
       	  return postRC;
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
