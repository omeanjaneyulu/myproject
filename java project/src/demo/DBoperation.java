package demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBoperation {
	Connection connection;
	Statement statement;
	ResultSet result;
	
	public DBoperation() {
		connection = MysqlConnection.getInstance();
	}
	public int insertDataWithStatement(Employee emp) {
		int result = 0;
		String query = "insert into Employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getAddress()+"')";
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
	DBoperation db = new DBoperation();
	Scanner sc = new Scanner(System.in);
	Employee em = new Employee();
	System.out.println("please enter emp id");
em.setId(sc.nextInt());
sc.nextLine();
System.out.println("please enter name");
em.setName(sc.nextLine());
System.out.println("please enter salary");
em.setSalary(sc.nextDouble());
sc.nextLine();
System.out.println("please enter address");
em.setAddress(sc.nextLine());
db.insertDataWithStatement(em);
	}

}
