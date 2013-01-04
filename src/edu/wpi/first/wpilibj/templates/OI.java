/**
 * Copyright 2012. FRC Team 3807.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.KinectStick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.templates.commands.SnapShot;
import edu.wpi.first.wpilibj.templates.commands.ToggleBallPickerDown;
import edu.wpi.first.wpilibj.templates.commands.ToggleBallPickerUp;
import edu.wpi.first.wpilibj.templates.commands.ToggleShooterOn;

public class OI {
    // This is the singleton instance of the OI class.
    private static OI instance = null;

    // This is the port the joystick is plugged into.
    private static final int JOYSTICK_PORT = 1;

    // These constants map the joystick buttons to constants.
    private static final int PORT_SHOOTER        = 1;
    private static final int PORT_ARM_UP         = 3;
    private static final int PORT_ARM_DOWN       = 4;
    private static final int PORT_PICKER_UP      = 5;
    private static final int PORT_PICKER_DOWN    = 6;
    private static final int PORT_SNAPSHOT       = 8;

    // These are the objects that represent controlling the robot with a
    // joystick.
    private Joystick joystick;
    private Button ballPickerUpButton;
    private Button ballPickerDownButton;
    private Button shootButton;
    private Button takeSnapshotButton;
    private Button moveArmDownButton;
    private Button moveArmUpButton;
    private DriveWithJoystick drive;

    // These are the objects that represent controlling the robot with a
    // Kinect.
    private KinectStick leftArm;
    private KinectStick rightArm;
    
    public OI() {
        // Initialize the joystick, the buttons, and the mapping betwen buttons
        // and commands.
        joystick = new Joystick(JOYSTICK_PORT);
        
        // Map a joystick button to the ball picker up command.
        ballPickerUpButton = new JoystickButton(joystick, PORT_PICKER_UP);
        ballPickerUpButton.whenPressed(new ToggleBallPickerUp());

        // Map a joystick button to the ball picker down command.
        ballPickerDownButton = new JoystickButton(joystick, PORT_PICKER_DOWN);
        ballPickerDownButton.whenPressed(new ToggleBallPickerDown());

        // Map a joystick button to the shoot command.
        shootButton = new JoystickButton(joystick, PORT_SHOOTER);
        shootButton.whenPressed(new ToggleShooterOn());

        // Map a joystick button to take a snapshot with the camera command.
        takeSnapshotButton = new JoystickButton(joystick, PORT_SNAPSHOT);
        takeSnapshotButton.whenPressed(new SnapShot());

        // Map a joystick button to move the bridge manipulator down.
        //moveArmDownButton = new JoystickButton(joystick, PORT_ARM_DOWN);
        //moveArmDownButton.whenPressed(new MoveArmDown());

        // Map a joystick button to move the bridge manipulator up.
        //moveArmUpButton = new JoystickButton(joystick, PORT_ARM_UP);
        //moveArmUpButton.whenPressed(new MoveArmUp());

        // Initialize the controls for the Kinect to control the robot.
        leftArm = new KinectStick(1);
        rightArm = new KinectStick(2);
    }

    /**
     * Return the singleton instance of the Operator Interface class.
     */
    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }

    /**
     * Get the joystick for this Operator Interface instance.
     * @return the joystick for this OI instance
     */
    public Joystick getJoystick() {
        return joystick;
    }

    /**
     * Get the left arm Kinect object for this Operator Interface instance.
     * @return the Kinect object for the left arm.
     */
    public KinectStick getLeftArm() {
        return leftArm;
    }

    /**
     * Get the right arm Kinect object for this Operator Interface instance.
     * @return the Kinect object for the right arm.
     */
    public KinectStick getRightArm() {
        return rightArm;
    }
}
