/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 * @author bhuang
 */
public class ToggleBallPickerDown extends CommandBase {

    public ToggleBallPickerDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(CommandBase.ballPicker);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
                System.out.println("ToggleDown Execute");

        if(ballPicker.isPickerOff() || ballPicker.isPickerUp()){ //Checks state
            ballPicker.ballPickerDown();
            SmartDashboard.putString("Lights:", "Off");
        }
        else{
            ballPicker.ballPickerOff();
            SmartDashboard.putString("Lights:", "Off");
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