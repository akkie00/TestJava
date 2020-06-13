package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Point2D [] point = new Point2D[sc.nextInt()];
//		int [] point = new int[sc.nextInt()];
		
		System.out.println("Enter points");
		Point2D p1= new Point2D(sc.nextInt(), sc.nextInt());
		Point2D p2= new Point2D(sc.nextInt(), sc.nextInt());

		
		System.out.println("p1: "+p1.show()+"P2: "+p2.show());
		System.out.println(p1.isEqual(p2) ? "Two points are equal": "Points are different");
		System.out.println("enter offset for new points");
		Point2D p3 = p2.offsetPoint(sc.nextInt(), sc.nextInt()); 
		
		System.out.println("Offset values"+p3.show());
			
		System.out.println("distance is: "+p1.calcDistance(p2));
		
		/*
		 * boolean exit = false;
		 * 
		 * while (!exit) {
		 * System.out.println("Option 1: P1 | Option 2: P2 | Option 4: Exit");
		 * 
		 * switch (sc.nextInt()) { case 1:
		 * System.out.println("Enter 1st point coords: "); // point = new
		 * Point2D(sc.nextInt(), sc.nextInt()); System.out.println(p1.show()); break;
		 * case 2: System.out.println("Enter 2nd Point coords: "); // Point2D p2 = new
		 * Point2D(sc.nextInt(), sc.nextInt()); System.out.println(p2.show()); break;
		 * 
		 * case 3: // System.out.println(p1.show()+" "+p2.show()); // for(Point2D p: )
		 * p1.isEqual(p2);
		 * 
		 * case 4: exit = true; break; }
		 * 
		 * }
		 */

		sc.close();
	}

}
