package com.lucafornelli94.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lucafornelli94.bean.Robot;
import com.lucafornelli94.bean.Robot.Cardinal;
import com.lucafornelli94.robot.GetRobotPositionResponse;
import com.lucafornelli94.robot.InitializeRobotPositionRequest;
import com.lucafornelli94.robot.InitializeRobotPositionResponse;
import com.lucafornelli94.robot.MoveRequest;
import com.lucafornelli94.robot.MoveResponse;
import com.lucafornelli94.robot.RobotInfo;
import com.lucafornelli94.robot.TurnLeftRequest;
import com.lucafornelli94.robot.TurnLeftResponse;
import com.lucafornelli94.robot.TurnRightRequest;
import com.lucafornelli94.robot.TurnRightResponse;
import com.lucafornelli94.services.RobotSimulatorService;

@Endpoint
public class RobotSimulatorEndpoint {
	
	@Autowired
	RobotSimulatorService service;
	
	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "GetRobotPositionRequest")
	@ResponsePayload
	public GetRobotPositionResponse processCourseDetailsRequest() {
		GetRobotPositionResponse response = new GetRobotPositionResponse();
		
		Robot robot = service.retrieveRobotInfos();
		
		RobotInfo robotInfos = mapRobotInfo(robot);
		response.setRobotInfo(robotInfos);
		
		return response;
	}
	
	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "InitializeRobotPositionRequest")
	@ResponsePayload
	public InitializeRobotPositionResponse processInitializeRobotPositionRequest(@RequestPayload InitializeRobotPositionRequest request) {
		InitializeRobotPositionResponse response = new InitializeRobotPositionResponse();
		
		Robot robot = service.initializeRobotPosition(
			request.getRobotInfo()
		);
		response.setRobotInfo(mapRobotInfo(robot));
		
		return response;
	}

	private RobotInfo mapRobotInfo(Robot robot) {
		
		RobotInfo robotInfos = new RobotInfo();
		robotInfos.setXPosition(robot.getXPosition());
		robotInfos.setYPosition(robot.getYPosition());
		robotInfos.setWidth(robot.getWidth());
		robotInfos.setHeight(robot.getHeight());
		robotInfos.setFacing(mapCardinal(robot.getFacing()));
		
		return robotInfos;
	}
	
	private com.lucafornelli94.robot.Cardinal mapCardinal(Cardinal cardinal) {
		if (cardinal == Cardinal.SOUTH)
			return com.lucafornelli94.robot.Cardinal.SOUTH;
		else if (cardinal == Cardinal.EAST)
			return com.lucafornelli94.robot.Cardinal.EAST;
		else if (cardinal == Cardinal.WEST)
			return com.lucafornelli94.robot.Cardinal.WEST;
		else
			return com.lucafornelli94.robot.Cardinal.NORTH;
	}
	
	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "TurnLeftRequest")
	@ResponsePayload
	public TurnLeftResponse processTurnLeftRequest(@RequestPayload TurnLeftRequest request) {
		TurnLeftResponse response = new TurnLeftResponse();
		
		Robot robot = service.turn("left");
		response.setRobotInfo(mapRobotInfo(robot));
		
		return response;
	}
	
	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "TurnRightRequest")
	@ResponsePayload
	public TurnRightResponse processTurnRightRequest(@RequestPayload TurnRightRequest request) {
		TurnRightResponse response = new TurnRightResponse();
		
		Robot robot = service.turn("right");
		response.setRobotInfo(mapRobotInfo(robot));
		
		return response;
	}

	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "MoveRequest")
	@ResponsePayload
	public MoveResponse processMoveRequest(@RequestPayload MoveRequest request) {
		MoveResponse response = new MoveResponse();
		
		Robot robot = service.move();
		response.setRobotInfo(mapRobotInfo(robot));
		
		return response;
	}
	
}
