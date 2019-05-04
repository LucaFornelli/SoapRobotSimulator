package com.lucafornelli94.helper;

import com.lucafornelli94.bean.Robot;
import com.lucafornelli94.bean.Robot.Cardinal;
import com.lucafornelli94.services.RobotSimulatorService;

public class UtilityHelper {
	public static Cardinal TurnValue(Robot robot, String value) {
		switch(robot.getFacing()) {
		case NORTH:
			if (value.equals(RobotSimulatorService.LEFT))
				return Cardinal.WEST;
			else if (value.equals(RobotSimulatorService.RIGHT))
				return Cardinal.EAST;
			break;
		case SOUTH:
			if (value.equals(RobotSimulatorService.LEFT))
				return Cardinal.EAST;
			else if (value.equals(RobotSimulatorService.RIGHT))
				return Cardinal.WEST;
			break;
		case EAST:
			if (value.equals(RobotSimulatorService.LEFT))
				return Cardinal.NORTH;
			else if (value.equals(RobotSimulatorService.RIGHT))
				return Cardinal.SOUTH;
			break;
		case WEST:
			if (value.equals(RobotSimulatorService.LEFT))
				return Cardinal.SOUTH;
			else if (value.equals(RobotSimulatorService.RIGHT))
				return Cardinal.NORTH;
			break;
		}
		return null;
	}
	
	public static Cardinal mapCardinal(com.lucafornelli94.robot.Cardinal cardinal) {
		if (cardinal == com.lucafornelli94.robot.Cardinal.SOUTH)
			return Cardinal.SOUTH;
		else if (cardinal == com.lucafornelli94.robot.Cardinal.EAST)
			return Cardinal.EAST;
		else if (cardinal == com.lucafornelli94.robot.Cardinal.WEST)
			return Cardinal.WEST;
		else
			return Cardinal.NORTH;
	}
}
