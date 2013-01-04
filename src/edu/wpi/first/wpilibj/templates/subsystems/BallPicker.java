/**
 * Copyright 2012. FRC Team 3807.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 * The ball picker subsystem picks up the ball from the floor and feeds it
 * into the ball shooter. The subsystem can move the ball both up and down.
 */
public class BallPicker extends Subsystem {
    // Only one motor is used to operate the ball picker and its a windshield
    // wiper motor thats controlled through a spike relay.

    // We keep track of the state of the ball picker here.
    private static final int BALL_PICKER_OFF    = 0;
    private static final int BALL_PICKER_UP     = 1;
    private static final int BALL_PICKER_DOWN   = 2;
    private int ballPickerState;
    public Relay pickerRelay;

    /**
     * This command turns off the ball picker.
     */
    public void ballPickerOff(){
        pickerRelay.set(Relay.Value.kOff);
        ballPickerState = BALL_PICKER_OFF;
    }

    /**
     * This command turns on the ball picker and moves the ball up on the belt.
     */
    public void ballPickerUp(){
        System.out.println("Ball picker up");
        pickerRelay.setDirection(Relay.Direction.kForward);
        pickerRelay.set(Relay.Value.kOn);
        ballPickerState = BALL_PICKER_UP;
    }

    /**
     * This command turns on the ball picker and moves the ball down the belt.
     */
    public void ballPickerDown(){
        System.out.println("Ball picker down");
        pickerRelay.setDirection(Relay.Direction.kReverse);
        pickerRelay.set(Relay.Value.kOn);
        ballPickerState = BALL_PICKER_DOWN;
    }

    /**
     * Check if the ball picker is off.
     */
    public boolean isPickerOff(){
        return ballPickerState == BALL_PICKER_OFF;
    }

    /**
     * Check if the ball picker is on and is moving the ball up the belt.
     * @return
     */
    public boolean isPickerUp() {
        return ballPickerState == BALL_PICKER_UP;
    }

    /**
     * Check if the ball picker is on and is moving the ball down the belt.
     * @return
     */
    public boolean isPickerDown(){
        return ballPickerState == BALL_PICKER_DOWN;
    }

    /**
     * Initialize the ball picker subsystem.
     * @param port the port number the spike relay is plugged into.
     */
    public BallPicker(int port) {
        pickerRelay = new Relay(port);
    }

    /**
     * Initialize the default command for the ball picker.
     */
    protected void initDefaultCommand() {
        // not default command at this point in time.
    }
}
