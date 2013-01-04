/**
 * Copyright 2012. FRC Team 3807.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


/**
 * This command group sets up child commands to run during hybrid mode.
 * This command group should enable the robot to drive with the Kinect and
 * it should enable the use of the shooter with the Kinect.
 */
public class ControlWithKinect extends CommandGroup {

    public ControlWithKinect() {
        addParallel(new DriveWithKinect());
        //addParallel(new ToggleBallPickerUpWithKinect());
    }
}