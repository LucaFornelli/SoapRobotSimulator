package com.lucafornelli94.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lucafornelli94.bean.Robot;
import com.lucafornelli94.robot.GetRobotPositionResponse;
import com.lucafornelli94.robot.InitializeRobotPositionRequest;
import com.lucafornelli94.robot.InitializeRobotPositionResponse;
import com.lucafornelli94.robot.RobotInfo;
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
		
		int result = service.initializeRobotPosition(
			request.getRobotInfo()
		);
		response.setResult(result);
		
		return response;
	}

	private RobotInfo mapRobotInfo(Robot robot) {
		
		RobotInfo robotInfos = new RobotInfo();
		robotInfos.setXPosition(robot.getXPosition());
		robotInfos.setYPosition(robot.getYPosition());
		robotInfos.setWidth(robot.getWidth());
		robotInfos.setHeight(robot.getHeight());
		robotInfos.setFacing(robot.getFacing());
		
		return robotInfos;
	}
}
