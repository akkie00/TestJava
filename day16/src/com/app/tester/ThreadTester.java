package com.app.tester;

import java.util.Scanner;

import com.app.thread.EvenPrinterTask;
import com.app.thread.OddPrinterTask;

public class ThreadTester {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println(Thread.currentThread().getName()+" -- Main thread");
		System.out.println("Enter range for even numbers");
		EvenPrinterTask even = new EvenPrinterTask(sc.nextInt(), sc.nextInt());
		Thread t1 = new Thread(even, "even thread");
		
		System.out.println("Enter range for odd numbers");
		OddPrinterTask odd = new OddPrinterTask(sc.nextInt(), sc.nextInt());
		Thread t2 = new Thread(odd, "odd thread");
		sc.close();
		
		Thread.sleep(100);
		
		t1.start();
		t2.start();
		
		System.out.println("main waiting for child to complete it's tasks");
		t1.join();
		t2.join();
		
		System.out.println("main over..");
		
		
	}

}
