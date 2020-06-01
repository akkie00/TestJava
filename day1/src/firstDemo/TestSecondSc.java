package firstDemo;

import java.util.Scanner;

public class TestSecondSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values: ");
		Second avg = new Second(sc.nextDouble(), sc.nextDouble());
		if (sc.hasNextDouble()) {
//			System.out.println(sc.hasNextDouble());
			System.out.println("Addition is: " + avg.getAddition());
			System.out.println("Average is: "+avg.getAverage());
		} else {
			System.out.println("enter only double value: " + sc.hasNextDouble());
		}
	}

}
