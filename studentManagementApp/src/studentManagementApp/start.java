package studentManagementApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;

public class start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("press 1 to Add students");
			System.out.println("press 2 to Delete students");
			System.out.println("press 3 to Display students");
			System.out.println("press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
//				add Students
				System.out.println("Enter user Name :");
				String name=br.readLine();
				
				System.out.println("Enter user phone : ");
				String phone= br.readLine();

				System.out.println("Enter user City : ");
				String City= br.readLine();
				
//				create student object to store student
				Student st= new Student(name, phone, City);
				studentDao.insertStudentToDB(st);
				System.out.println(st);
			}
			else if(c==2) {
//				delete Students
			}
			else if(c==3) {
//				display students
			}
			else if(c==4) {
//				exit
				break;
			}
			else {
//				wrong choise
			}
			
			
		}System.out.println("thanks for Using my App");
		System.out.println("see yaa!!!");
		System.out.println("byeeee");

	}

}
