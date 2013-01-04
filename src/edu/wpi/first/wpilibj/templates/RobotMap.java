package edu.wpi.first.wpilibj.templates;

/**
 * Copyright 2012. FRC Team 3807.
 */

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // These values are the port numbers the subsystems need to operate.
    // All the below port numbers are on the digital side-car.
    public static final int BALL_PICKER_SPIKE_RELAY_PORT_NUMBER    = 8;
    public static final int ARM_COMPRESSOR_PRESSURE_SWITCH_PORT    = 5;
    public static final int ARM_COMPRESSOR_RELAY_PORT              = 6;
    public static final int SHOOTER_BOTTOM_RELAY_PORT              = 1;
    public static final int SHOOTER_TOP_RELAY_PORT                 = 2;

    //These values use the Digital PWM Channels
    public static final int CHASSIS_FRONT_LEFT_CONTROLLER_PORT     = 1;
    public static final int CHASSIS_REAR_LEFT_CONTROLLER_PORT      = 4;
    public static final int CHASSIS_FRONT_RIGHT_CONTROLLER_PORT    = 3;
    public static final int CHASSIS_REAR_RIGHT_CONTROLLER_PORT     = 7;

    // These values are for the port numbers on the solenoid. They are separate
    // from the port numbers above that are used for the solenoid.
    public static final int ARM_SOLENOID_FORWARD_PORT              = 1;
    public static final int ARM_SOLENOID_REVERSE_PORT              = 2;

    // These values are port numbers for gyro and accelerometer.
    public static final int GYRO_PORT                               = 1;
    public static final int ACCELEROMETERX_PORT                     = 3;
    public static final int ACCELEROMETERY_PORT                     = 2;

    //These values are port numbers for limit switches (Digital Input)
    public static final int SHOOTER_LIMIT_SWITCH_PORT               = 1;
}
