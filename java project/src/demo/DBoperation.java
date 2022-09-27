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
	public int insertDataWithStatement(EmployeeBean em) {
		int result = 0;
		String query = "insert into EmployeeBean values("+em.getEmployeeId()+",'"+em.getFirstName()+"','"+em.getLastName()+"','"+em.getFatherName()+"')";
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
//	public int deletedata(Employee emp) {
//		int result = 0;
//		String query = "update EmployeeBean set id="+emp.getId()+" where id=7 ";
//		try {
//		statement = connection.createStatement();
//		result = statement.executeUpdate(query);
//		
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
	
	public static void main(String[] args) {
	DBoperation db = new DBoperation();
	Scanner sc = new Scanner(System.in);
	//for(;;) {
//		System.out.println("please enter your choice=\n"+
//	"1.update employeeBean data \n"+
//	"2.delete employeeBean data");
		
//	int n = sc.nextInt();
	
		
	EmployeeBean em = new EmployeeBean();
//	switch(n) {
	//case 1:
		System.out.println("please enter emp id");
		em.setEmployeeId(sc.nextLine());
	//	sc.nextLine();
		System.out.println("please enter first name");
		em.setFirstName(sc.nextLine());
		System.out.println("please enter lastName");
		em.setLastName(sc.nextLine());
		System.out.println("please enter fatherName");
		em.setFatherName(sc.nextLine());
	//	sc.nextLine();

		db.insertDataWithStatement(em);

	
	//break;
//	case 2:22
	//	System.out.println("please enter id to be deleted");
	//	em.setEmployeeBeanId(sc.nextInt());
	//	db.deletedata(em);
	}
/*		
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

	}*/

	
}

