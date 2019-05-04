package com.lucafornelli94.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lucafornelli94.robot.GetRobotPositionRequest;
import com.lucafornelli94.robot.GetRobotPositionResponse;
import com.lucafornelli94.robot.RobotInfo;

@Endpoint
public class RobotSimulatorEndpoint {
	@PayloadRoot(namespace = "http://lucafornelli94.com/robot", localPart = "GetRobotPositionRequest")
	@ResponsePayload
	public GetRobotPositionResponse processCourseDetailsRequest(@RequestPayload GetRobotPositionRequest request) {
		GetRobotPositionResponse response = new GetRobotPositionResponse();
		
		RobotInfo robotInfos = new RobotInfo();
		robotInfos.setId(request.getId());
		robotInfos.setXPosition(0);
		robotInfos.setYPosition(3);
		robotInfos.setWidth(4);
		robotInfos.setHeight(4);
		robotInfos.setFacing("NORTH");
		response.setRobotInfo(robotInfos);
		
		return response;
	}
}
