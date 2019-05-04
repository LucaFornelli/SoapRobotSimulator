package com.lucafornelli94.bean;

public class Robot {
	
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private String facing;

	public Robot(int xPosition, int yPosition, int width, int height, String facing) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
		this.facing = facing;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public int getXPosition() {
		return xPosition;
	}

	public void setXPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getYPosition() {
		return yPosition;
	}

	public void setYPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
 
	@Override
	public String toString() {
		return String.format("Robot [X Position=%s, Y Position=%s, Ring Width=%s, Ring Height=%s, Facing=%s]", xPosition, yPosition, width, height, facing);
	}
}
