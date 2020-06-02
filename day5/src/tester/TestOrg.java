package tester;

import com.app.org.Employee;
import com.app.org.Manager;

public class TestOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mgr = new Manager(01, "Akshay", 1232, 010, 1000);
		System.out.println(mgr.getName()+" "+mgr.computeNetSalary()+" ");
	}

}
