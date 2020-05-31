package firstDemo;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello from IDE");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number: ");
		double num1 = sc.nextDouble();
		System.out.println("enter 2nd number: ");
		double num2 = sc.nextDouble();
		System.out.println("Addition: "+(num1+num2));
		System.out.println("Subtraction: "+(num1-num2));
		System.out.println("Multiplication: "+(num1*num2));
		System.out.println("Division: "+(num1/num2));
		sc.close();
	}

}
