/**
 * Copyright 2012. FRC Team 3807.
 */

package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * This command group sets up child commands to run during hybrid mode.
 * This command group should enable the robot to drive with the Kinect and
 * it should enable the use of the shooter with the Kinect.
 */
public class DriveForwardAndShoot extends CommandGroup {

    public DriveForwardAndShoot() {
        addParallel(new DriveStraight());
        addParallel(new ToggleBallPickerDown());
        addParallel(new ToggleShooterOn());
    }
}
