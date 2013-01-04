/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;


/**
 *
 * @author bhuang
 */
public class ToggleBallPickerUpWithKinect extends CommandBase {

    public ToggleBallPickerUpWithKinect() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(CommandBase.ballPicker);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        System.out.println("ToggleUp Execute");

        if(OI.getInstance().getRightArm().getY() >= 0){
            ballPicker.ballPickerUp();
        }
        else{
            ballPicker.ballPickerOff();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}