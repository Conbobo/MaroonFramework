package com.team766.frc2020.procedures;

import com. team766. framework.Procedure;
import com.team766. framework.Context;
import com.team766.frc2020.Robot;

public class downKill extends Procedure{
	public void run(Context context){
		context.takeOwnership(Robot.boatHair);
		Robot.boatHair.setChopSpeed(-0.4);
		context.waitForSeconds(1);
		Robot.boatHair.setChopSpeed(0);
	}
}