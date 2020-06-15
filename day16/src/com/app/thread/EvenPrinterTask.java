package com.app.thread;


public class EvenPrinterTask implements Runnable {
	
	private int start;
	private int end;
	
	public EvenPrinterTask(int rangeStart, int rangeEnd) {
		this.start = rangeStart;
		this.end = rangeEnd;
	}
	
	public void run()  {
		
		try {
		for(int i = start; i<=end; i++) {
			if(i%2 ==0) {
				Thread.sleep(1500);
				System.out.println("Even number: "+i);
			}
		}
		}
		catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" throws "+e.getMessage());
			
		}
	}
	
}
