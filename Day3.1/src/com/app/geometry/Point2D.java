package com.app.geometry;

public class Point2D {

	private int xCoord;
	private int yCoord;
	
	public Point2D(int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public String show() {
		return "x-coord:"+xCoord+" y-coord: "+yCoord;
	}
	
	public boolean isEqual(Point2D p2) {
		
		if(this.xCoord == p2.xCoord && this.yCoord == p2.yCoord) {
			return true;
		}	
		return false;
	}
	
	public Point2D offsetPoint(int offX, int offY) {
		
		return new Point2D(this.xCoord+offX,this.yCoord+offY);
	}
	
	public double calcDistance(Point2D p2) {
		
		return (Math.sqrt
				(Math.pow
						(this.xCoord - p2.xCoord, 2)
						+Math.pow(this.yCoord - p2.yCoord, 2)));
	}
}
