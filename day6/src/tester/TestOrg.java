package tester;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrg {

	public static void main(String[] args) {
				// passing hardcoded values to parameterized constructor of Manager class
		// direct referencing
		Manager mgr = new Manager(101, "Akshay", 10000, 10, 20.00);
		System.out.println(mgr);
		Worker work = new Worker(101, "Akshay", 11, 15000, 8, 10);
		System.out.println(work);
		
		Manager mgr2 = new Manager(101, "Akshay", 10235, 12, 15.00);
		System.out.println(mgr2);
		System.out.println(mgr.equals(work));
		
//		System.out.println((mgr2.getName()).equals(mgr.getName()));
//		System.out.println(mgr.computeNetSalary());
//		System.out.println(work.computeNetSalary());
	}
}
