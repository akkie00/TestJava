package firstDemo;

import java.util.Locale;
import java.util.Scanner;

public class TestSecondSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Enter values: ");
		if (sc.hasNextDouble()) {
//				Second avg = new Second(sc.nextDouble(), sc.nextDouble());
//			Second avg = new Second(num1, num2);
				double d1 = sc.nextDouble();
				 if(sc.hasNextDouble()){
				double d2 = sc.nextDouble();
				Second avg = new Second(d1, d2);
//				System.out.println("value of if" + sc.hasNextDouble());
//				System.out.println("Addition is: " + avg.getAddition());
				System.out.println("Average is: " + avg.getAverage());

			}
				 else if(sc.hasNext()) {
						System.out.println("enter only double value: " + sc.hasNextDouble());
					}
		}
			
		else {
			System.out.println("enter only double");
		}
		
		sc.close();
	}

}
