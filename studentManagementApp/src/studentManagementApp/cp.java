package studentManagementApp;
import java.sql.*;
public class cp {
	static Connection con;
	public static  Connection createC(){
//load
		try {
			String user="root";
			String password="123456";
			String url="jdbx:mysql://localhost:3306/student_manage";
			
			con=DriverManager.getConnection(url,user,password);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}return con;
	}
}
