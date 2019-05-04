package com.lucafornelli94.services;

import org.springframework.stereotype.Component;

import com.lucafornelli94.bean.Robot;

@Component
public class RobotInfoService {

	static Robot robot;
	
	static {
		if (robot == null)
			robot = new Robot(0, 0, 0, 0, "NORTH");
	}

	public Robot findRobotInfos() {
		return robot;
	}
}
