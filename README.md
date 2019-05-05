# SoapRobotSimulator
This is a robot simulator realized with SOAP services

Description:

The application is a simulation of a toy robot moving on a square tabletop.

There are no other obstructions on the table surface.

The robot is free to roam around the surface of the table, but must be prevented from falling to destruction. 
Any movement that would result in the robot falling from the table must be prevented, 
however further valid movement commands must still be allowed.

**As follow, the SOAP services commands available are**

```
**InitializeRobotPosition**
<!-- InitializeRobotPosition service request -->
	<xs:element name="InitializeRobotPositionRequest">
		<xs:complexType>
			<xs:sequence>
				<xs:element name="RobotInfo" type="tns:RobotInfo" />
			</xs:sequence>
		</xs:complexType>
	</xs:element>

<!-- InitializeRobotPosition service response -->
	<xs:element name="InitializeRobotPositionResponse">
		<xs:complexType>
			<xs:sequence>
				<xs:element name="RobotInfo" type="tns:RobotInfo" />
			</xs:sequence>
		</xs:complexType>
	</xs:element>
```

```
**GetRobotPosition**
	<!-- GetRobotPosition service request -->
	<xs:element name="GetRobotPositionRequest">
		<xs:complexType>
		</xs:complexType>
	</xs:element>

	<!-- GetRobotPosition service response -->
	<xs:element name="GetRobotPositionResponse">
		<xs:complexType>
			<xs:sequence>
				<xs:element name="RobotInfo" type="tns:RobotInfo" />
			</xs:sequence>
		</xs:complexType>
	</xs:element>
```
