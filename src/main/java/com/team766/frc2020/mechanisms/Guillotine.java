package com.team766.frc2020.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;


public class Guillotine extends Mechanism{
	private SpeedController m_choppyChoppy;

	public Guillotine(){
		m_choppyChoppy = RobotProvider.instance.getMotor("Miranda");
	}

	public void setChopSpeed(double grabPower){
		checkContextOwnership();

		m_choppyChoppy.set(grabPower);
	}
}