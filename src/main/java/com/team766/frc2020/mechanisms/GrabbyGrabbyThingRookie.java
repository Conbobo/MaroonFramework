package com.team766.frc2020.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;


public class GrabbyGrabbyThingRookie extends Mechanism{
	private SpeedController m_grabbyGrabby;

	public GrabbyGrabbyThingRookie(){
		m_grabbyGrabby = RobotProvider.instance.getMotor("Phil");
	}

	public void setGrabPower(double grabPower){
		checkContextOwnership();

		m_grabbyGrabby.set(grabPower);
	}
}