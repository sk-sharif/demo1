def call(Map config = [:]) {
  echo "checking 1"
  def connection = new URL("http://localhost:8012/get").openConnection();
  echo "checking 2"
  def getRC = get.getResponseCode();
  echo "checking 3"
  println(getRC);
  echo "checking 4"
  if(getRC.equals(200)) {
    println(get.getInputStream().getText());
  }
}
