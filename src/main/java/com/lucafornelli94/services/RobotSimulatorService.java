package com.lucafornelli94.services;

import org.springframework.stereotype.Component;

import com.lucafornelli94.bean.Robot;
import com.lucafornelli94.robot.RobotInfo;

@Component
public class RobotSimulatorService {

	static Robot robot;
	static final int DEFAULT_X_POSITION = 0;
	static final int DEFAULT_Y_POSITION = 0;
	static final int DEFAULT_WIDTH = 0;
	static final int DEFAULT_HEIGHT = 0;
	static final String DEFUALT_FACING = "NORTH";

	static {
		if (robot == null)
			robot = new Robot(DEFAULT_X_POSITION, DEFAULT_Y_POSITION, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFUALT_FACING);
	}

	public Robot retrieveRobotInfos() {
		return robot;
	}

	public int initializeRobotPosition(RobotInfo robotInfo) {
		
		robot.setXPosition((robotInfo.getXPosition()>0)?robotInfo.getXPosition():DEFAULT_X_POSITION);
		robot.setYPosition((robotInfo.getYPosition()>0)?robotInfo.getYPosition():DEFAULT_Y_POSITION);
		robot.setWidth((robotInfo.getWidth()>0)?robotInfo.getWidth():DEFAULT_WIDTH);
		robot.setHeight((robotInfo.getHeight()>0)?robotInfo.getHeight():DEFAULT_HEIGHT);
		robot.setFacing((robotInfo.getFacing()!=null)?robotInfo.getFacing():DEFUALT_FACING);
		return 1;
	}
}
