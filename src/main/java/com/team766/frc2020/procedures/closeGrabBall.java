package com.team766.frc2020.procedures;

import com. team766. framework.Procedure;
import com.team766. framework.Context;
import com.team766.frc2020.Robot;

public class closeGrabBall extends Procedure{
	public void run(Context context){
		context.takeOwnership(Robot.grabby);
		Robot.grabby.setGrabPower(-0.4);
		context.waitForSeconds(1);
		Robot.grabby.setGrabPower(0);
	}
}