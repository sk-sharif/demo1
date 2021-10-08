import groovy.sql.Sql
import java.text.SimpleDateFormat
import java.time.LocalDateTime
def branch = "${env.BRANCH_NAME}"

  
def logging(Map config = [:]) {
    def url = 'jdbc:postgresql://localhost:5432/imqsdb'
    def user = 'postgres'
    def password = 'newPassword'
    def driver = 'org.postgresql.Driver'
    def sql = Sql.newInstance(url, user, password, driver)
  
   sql.execute """
      CREATE TABLE IF NOT EXISTS logs_table (
   ID  serial PRIMARY KEY,
   branch TEXT,
   logged_date DATE DEFAULT CURRENT_DATE,
   logged_time TIME DEFAULT CURRENT_TIME,
   pipeline_log TEXT
   );
   """
    sql.execute "INSERT INTO logs_table(branch,pipeline_log) VALUES (${config.branch_name},${config.action})"
    sql.close()  
}
