package com.lucafornelli94.services;

import org.springframework.stereotype.Component;

import com.lucafornelli94.bean.Robot;
import com.lucafornelli94.bean.Robot.Cardinal;
import com.lucafornelli94.exception.OutOfBorderException;
import com.lucafornelli94.helper.UtilityHelper;
import com.lucafornelli94.robot.RobotInfo;

@Component
public class RobotSimulatorService {

	private static Robot robot;
	private static final int DEFAULT_X_POSITION = 0;
	private static final int DEFAULT_Y_POSITION = 0;
	private static final int DEFAULT_WIDTH = 0;
	private static final int DEFAULT_HEIGHT = 0;
	private static final Cardinal DEFUALT_FACING = Cardinal.NORTH;
	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	

	static {
		if (robot == null)
			robot = new Robot(DEFAULT_X_POSITION, DEFAULT_Y_POSITION, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFUALT_FACING);
	}

	public Robot retrieveRobotInfos() {
		return robot;
	}

	public Robot initializeRobotPosition(RobotInfo robotInfo) {
		
		if(robotInfo.getXPosition() > robotInfo.getWidth() || robotInfo.getYPosition() > robotInfo.getHeight())
			throw new OutOfBorderException("Choose a right position for the robot");
		robot.setXPosition((robotInfo.getXPosition()>0)?robotInfo.getXPosition():DEFAULT_X_POSITION);
		robot.setYPosition((robotInfo.getYPosition()>0)?robotInfo.getYPosition():DEFAULT_Y_POSITION);
		robot.setWidth((robotInfo.getWidth()>0)?robotInfo.getWidth():DEFAULT_WIDTH);
		robot.setHeight((robotInfo.getHeight()>0)?robotInfo.getHeight():DEFAULT_HEIGHT);
		robot.setFacing((robotInfo.getFacing()!=null)?UtilityHelper.mapCardinal(robotInfo.getFacing()):DEFUALT_FACING);
		return robot;
	}
	
	public Robot turn(String value) {
		robot.setFacing(UtilityHelper.TurnValue(robot, value));
		return robot;
	}
	
	public Robot move() {
		switch(robot.getFacing()) {
		case NORTH:
			if (robot.getYPosition()+1 < robot.getHeight())
				robot.setYPosition(robot.getYPosition()+1);
			else
				throw new OutOfBorderException("Movement not allowed");
			break;
		case SOUTH:
			if (robot.getYPosition()-1 >= 0)
				robot.setYPosition(robot.getYPosition()-1);
			else
				throw new OutOfBorderException("Movement not allowed");
			break;
		case EAST:
			if (robot.getXPosition()+1 < robot.getWidth())
				robot.setXPosition(robot.getXPosition()+1);
			else
				throw new OutOfBorderException("Movement not allowed");
			break;
		case WEST:
			if (robot.getXPosition()-1 >= 0)
				robot.setXPosition(robot.getXPosition()-1);
			else
				throw new OutOfBorderException("Movement not allowed");
			break;
		}
		return robot;
	}
}
