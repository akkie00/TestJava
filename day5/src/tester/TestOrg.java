package tester;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// passing hardcoded values to parameterized constructor of Manager class
		// direct referencing

		/*
		 * Manager mgr = new Manager(722, "Akshay", 13245, 101, 1000);
		 * System.out.println("Name: "+mgr.getName()+";Net Sal: "+mgr.computeNetSalary()
		 * +";Sal: "+mgr.getBasicSal()
		 * +";DeptID: "+mgr.getDeptID()+";Perf Bonus: "+mgr.getPerfBonus());
		 */

		// Passing hard coded values to parameterized constructor of Worker class
		// direct referencing

		/*
		 * Worker worker = new Worker(744, "Shady", 110, 123456, 8, 17);
		 * System.out.println("Name: "+worker.getName()+";Net Sal "+worker.getBasicSal()
		 * +";DeptID: "+worker.getDeptID()
		 * +";Sal: "+worker.getBasicSal()+";Hrs worked: "+worker.getHoursWorked()
		 * +";Hrly rate: "+worker.getHourlyRate());
		 */

		// calling overridden and special methods of Manager class
		/*
		 * System.out.println(mgr.getDetails());
		 * System.out.println("Manager's perf bonus: "+mgr.getPerfBonus());
		 * System.out.println("Manger computed salary: "+mgr.computeNetSalary());
		 */

		// calling overriden and special methods of Worder class
		/*
		 * System.out.println(worker.getDetails());
		 * System.out.println("worker's computed salary:"+worker.computeNetSalary());
		 * System.out.println("hrly rate"+worker.getHourlyRate()+" hours worked: "
		 * +worker.getHoursWorked());
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees do you want to hire?");
		Employee[] emp = new Employee[sc.nextInt()];

		boolean exit = false;
		int counter = 0;

		while (!exit) {
//			System.out.println("here" + emp.length);
			System.out.println("Choose your option: ");
			System.out.println("Option 1: Hire Manager |  Option 2: Hire Worker | Option 3: Display hire details | Option 4: Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter manager details: ");
				if (counter < emp.length) {
					emp[counter++] = new Manager(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(),
							sc.nextDouble());
				}
				else {
					System.out.println("Please select number of hires again!");
				}

				break;
			case 2:
				System.out.println("Enter worker details: ");
				if(counter < emp.length) {
//					System.out.println("details of worker: ");
					emp[counter++] = new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),sc.nextInt(), sc.nextInt());
				}
				else {
					System.out.println("Please select number of hires again!");
				}
				break;
			
			case 3:
				for(Employee e: emp) {
//					System.out.println(e);
//					System.out.println(e.computeNetSalary());
					if(e!=null) {
						System.out.println("Employee details: ");
						System.out.println(e.getDetails());
					}
				}
				
				break;
			
			case 4:
				exit = true;
				break;
			}
		}
		System.out.println("here, here");
		sc.close();
	}

}
