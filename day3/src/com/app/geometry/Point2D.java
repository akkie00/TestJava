package com.app.geometry;

public class Point2D {
	private int xCoord;
	private int yCoord;
	
	
	public Point2D(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}
	
	public String show() {
		
		return "x: "+xCoord+"y: "+yCoord;	
	}
	
	public boolean isEqual(int x, int y){
		if(this.xCoord == x && this.yCoord == y) {
			return true;
		}
		return false; 
	}
}
