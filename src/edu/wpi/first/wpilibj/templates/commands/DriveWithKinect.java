/**
 * Copyright 2012. FRC Team 3807.
 */

package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.OI;

/**
 * Drive the chassis with the Kinect.
 */
public class DriveWithKinect extends CommandBase {


    public DriveWithKinect() {
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.driveWithKinect(OI.getInstance().getLeftArm(),
                                OI.getInstance().getRightArm());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}