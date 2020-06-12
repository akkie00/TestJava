package com.app.core;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer details");
		
		//parameterized constructor 
		Customer cust = new Customer(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
		System.out.println(cust.getDetails());
		
		//getting 3 ips from user, creditLimit initialized
		Customer cust2 = new Customer(sc.next(), sc.next(), sc.nextInt());
		System.out.println(cust2.getDetails());
		
		//parameterless constructor, all inputs initialized.
		Customer cust3 = new Customer();
		System.out.println(cust3.getDetails());
		
		System.out.println(cust.getCreditLimit()+1000);
		System.out.println(cust.getDetails()
				);
		sc.close();
	}

}
