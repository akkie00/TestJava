package com.app.thread;


public class OddPrinterTask implements Runnable {
	
	private int start;
	private int end;
	
	public OddPrinterTask(int rangeStart, int rangeEnd) {
		this.start = rangeStart;
		this.end = rangeEnd;
	}
	
	public void run()  {
		
		try {
		for(int i = start; i<=end; i++) {
			if(i%2 !=0) {
				Thread.sleep(500);
				System.out.println("Odd number: "+i);
			}
		}
		}
		catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" throws "+e.getMessage());
			
		}
	}
	
}
