// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2619.PowerUp2018Safety.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;
import org.usfirst.frc2619.PowerUp2018Safety.Robot;

/**
 *
 */
public class StationOneLeftScaleOnly extends ConditionalCommand {


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public StationOneLeftScaleOnly() {
      super(new StationOneLeftScale(), new StationOneLeftSwitchOnly());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR

    }

    @Override
    protected boolean condition(){
        return DriverStation.getInstance().getGameSpecificMessage().charAt(1) == 'L';//TODO: Auto Generated method stub
    }
}
