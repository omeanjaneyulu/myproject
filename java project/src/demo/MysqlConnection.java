package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

  public class MysqlConnection {
  private static MysqlConnection mysqlconnection = new MysqlConnection();

   Connection connection;
   private MysqlConnection() {

 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm","root","Ome@1995");
	 }
     
	
    catch(SQLException e) {
    	e.printStackTrace();
 }
}
	
			public static Connection getInstance(){
				return mysqlconnection.connection;
				}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MysqlConnection.getInstance());
}
	}


