
package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBclass {
    static private Connection  connection;
  private String id;
    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redwing", "root", "");
        }
        return connection;
    }

       public void setuser ( String n ) {
   id = n;
}
       public String getuser() {
   return id;
} 
}
