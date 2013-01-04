/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2012. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.ControlWithKinect;
import edu.wpi.first.wpilibj.templates.commands.DriveStraight;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command controlWithKinect;
    Command driveStraight;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // Initialize all subsystems
        CommandBase.init();

        // Initialize the command used during autonomous mode.
        controlWithKinect = new ControlWithKinect();
        driveStraight = new DriveStraight(1);
    }

    /**
     * Initialize anything that will be used exclusively during autonomous
     * mode.
     */
    public void autonomousInit() {
        // Start the command to control the robot with the Kinect
       // controlWithKinect.start();
         //driveStraight.start(); //EXPIRIMENTAL! USE AT OWN RISK
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        // Run the scheduler so the control with Kinect command executes
        // continously.
        Scheduler.getInstance().run();
        //System.out.println("Gyro Angle: " + CommandBase.gyro.getAngle());
    }

    /** c ccc /
     * Initialize any code that will be used during the teleoperated period.
     */
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
	// teleop starts running. If you want the autonomous to 
	// continue until interrupted by another command, remove
	// this line or comment it out.
	controlWithKinect.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        // The default command for the Chassis subsystem is driving with
        // the joystick so we don't need to start any commands for teleop.
        Scheduler.getInstance().run();
    }
}
