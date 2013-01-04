/**
 * Copyright 2012. FRC Team 3807.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The bridge manipulator subsystem is the class used to control the arm the lowers
 * the balancing bridge in the middle of the court. Currently its implemented using
 * pneumatics to push a lever which lowers the bridge down.
 */
public class BridgeManipulator extends Subsystem {
    // The solenoid is to move the piston up and down. The piston will then
    // lower the leve to move the bridge up or down.
    DoubleSolenoid doubleSolenoid;
    Compressor compressor;

    /**
     * Tell the piston to shoot out, moving the lever down.
     */
    public void moveArmDown() {
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    /**
     * Tell the piston to reverse, moving the lever up.
     */
    public void moveArmUp() {
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    /**
     * Initialize the default command.
     */
    public void initDefaultCommand() {
        // do nothing for now
    }

    /**
     * Initialize the bridge manipulator with the ports the solenoid and the
     * compressor are channeled.
     * 
     * @param forwardSolenoidChannel
     * @param reverseSolenoidChannel
     * @param pressureSwitchChannel
     * @param compressorRelayChannel
     */
    public BridgeManipulator (int forwardSolenoidChannel,
                              int reverseSolenoidChannel,
                              int pressureSwitchChannel,
                              int compressorRelayChannel)  {
        doubleSolenoid = new DoubleSolenoid(forwardSolenoidChannel, reverseSolenoidChannel);
        compressor = new Compressor(pressureSwitchChannel, compressorRelayChannel);
        compressor.start();
    }
}