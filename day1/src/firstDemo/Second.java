package firstDemo;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		sc.hasNextDouble();
		System.out.println("enter num1 & num2 : "+sc.hasNextDouble()+""+sc.hasNextDouble());
		
		if(sc.hasNextDouble())
			System.out.println("yes");
		else
			System.out.println("error");
		sc.close();
	}

}
