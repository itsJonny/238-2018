package org.usfirst.frc.team238.robot;

import java.util.HashMap;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class CrusaderCommon {

	// All button inputs for the operator
	// MAKE THESE INT
	public static final int stopEverythingInput = 0;

	/* DO NOT NUKE */
	// two types of command lists
	public static final int OPR_CMD_LIST = 1;
	public static final int LEFTDRIVER_CMD_LIST = 2;
	public static final int RIGHTDRIVER_CMD_LIST = 3;
	/* DO NOT NUKE */
	public static final int DT_CMD_LIST = 4;

	/* DO NOT NUKE */
	public static final int INPUT_DRIVER_LEFT_JS = 2;
	public static final int INPUT_DRIVER_RIGHT_JS = 3;

	// this element in the commandValue array is only
	// used by the AutoMode1Impl class. CommandController
	// is unaware of it

	/* DO NOT NUKE */
	public static final boolean SHIFTER_HIGH_GEAR = true;
	public static final boolean SHIFTER_LOW_GEAR = false;

	public static final double DRIVETRAIN_MAX_RPM = 1500;
	public static final double SHOOTER_MAX_RPM = SmartDashboard.getNumber("SHOOTER RPM", 0);// 1500;

	public static final double AUTO_JSON_CREATOR_PARAM_LIMIT = 4;

	/*
	 * The AUTO_DRIVE_* constants are the joystick positions when moving in the
	 * expected direction. These values are passed to the RobotDrive.tankDrive
	 * method.
	 */
	/* DO NOT NUKE */
	public static final double AUTO_DRIVE_FORWARD = 0.75;
	public static final double AUTO_DRIVE_BACKWARD = -0.75;
	public static final double AUTO_DRIVE_IDLE = 0.0;

	/* DO NOT NUKE */
	// public static final HashMap<Integer, Boolean> DRIVE_TRAIN_CMD_IDX = new
	// HashMap<Integer, Boolean>() {{put(0,true);}};
	public static final Integer[] DRIVE_TRAIN_CMD_IDX = new Integer[0];

	/* DO NOT NUKE */
	public static final int AUTO_DRIVE_LIMIT = 15000;

	// Intake Motor Values
	public final static double SERIALIZER_MOTOR_ON = 0.77;// 0.77;
	public final static double SERIALIZER_MOTOR_OFF = 0;
	public final static double SERIALIZER_MOTOR_ON_REVERSE = -0.77;

	public final static double INTAKE_MOTOR_ROTATE_IN = -1.0;
	public final static double INTAKE_MOTOR_ROTATE_OUT = 1.0;
	public final static double INTAKE_MOTOR_OFF = 0;

	public final static int VISION_ANGLE_SLOT = 0;
	public final static int VISION_DISTANCE_SLOT = 1;

	public final static double TRACKING_MOTOR_VALUE = 1;

	public final static double TALON_F_VALUE = 0.21;
	public final static double TALON_P_VALUE = 0.5;//0.5
	public final static double TALON_D_VALUE = 11;
	public final static int TALON_NO_VALUE = 0;

	/* THESE ARE THE ALL THE TALON IDS FOR THE 2018 ROBOT */
	
	public static final int DRIVE_TRAIN_RIGHT_MASTER = 0;
	public static final int DRIVE_TRAIN_RIGHT_SLAVE1 = 1;
	public static final int DRIVE_TRAIN_RIGHT_SLAVE2 = 2;
	
	public static final int DRIVE_TRAIN_LEFT_MASTER = 15;
	public static final int DRIVE_TRAIN_LEFT_SLAVE1 = 14;
	public static final int DRIVE_TRAIN_LEFT_SLAVE2 = 13;
	
	
	public static final double ELEVATOR_CUBE_SPEED = 0.8;
	public static final double ELEVATOR_CLIMB_SPEED = 0.5;
	
	public static final double INTAKE_WRIST_SPEED = 0.7;
	public static final double INTAKE_SPEED = 0.8;
	

	// Servo power setting

	// Power Distribution Panel (PDP) ID's

	// CurrentDraw variable
	public final static double CURRENT_DRAW_LIMIT = 20.0;

	// Test values

	// FPID VALUES FOR SHOOTER

	// PID VALS FOR NAVIGATION
	public final static double NAVIGATION_P_VALUE = 0.1;
	public final static double NAVIGATION_MAX_MOTOR_INCREMENT = 0.2;
	public final static double NAVIGATION_TURNING_DEADZONE = 1.5;

	public final static double DRIVE_FORWARD_P_VALUE = 0.015;
	public final static double DRIVE_FORWARD_I_VALUE = 0;
	public final static double DRIVE_FORWARD_MAX_YAW_PERCENT = 0.1;

	// SETERMINE THIS EXACT NUMBER FOR NEW ROBOT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// //325 = 1 inch 3900 = 1 foot
	public final static int DRIVE_FORWARD_ENCODER_TICKS_PER_INCH = 280;//252;//323;// 4983;//3900;

	// TURNING AND DRIVING PID VALUES
	public final static double TURN_P_VALUE = 0.0007;// 0.003;//SmartDashboard.getNumber("Turn
														// P
														// Value",0.005);//0.005;
	public final static double TURN_I_VALUE = 0.00120;// 0.00125;//0.003;//FIND
														// A VALUE FOR THIS
	public final static double TURN_DEAD_STOP = 0.175;// 0.25;//SmartDashboard.getNumber("Turn
														// Dead Stop",
														// 0.42);//0.42;
	public final static double TURN_DEAD_STOP_RIGHT = 0.118;
	public final static double TURN_MAX_ERROR = 80;// SmartDashboard.getNumber("Turn
													// Max Error",45);//45;
	public final static double TURN_MAX_MOTOR_VALUE = .7;// SmartDashboard.getNumber("Turn
															// Max
															// Error",45);//45;

	public final static double STRAIGHT_P_VALUE = 0.000055;// 0.00003512;
	public final static double STRAIGHT_I_VALUE = 0.0000095;
	public final static double STRAIGHT_DEAD_STOP = 0.1;// 0.05;
	public final static double STRAIGHT_MAX_ERROR = 15000;// 9966;
	public final static double STRAIGHT_MAX_MOTOR_VALUE = 1;// SmartDashboard.getNumber("Turn
															// Max
															// Error",45);//45;

	public static final int AUTONOMOUS_READ_FILE = 2;
	public static final int AUTONOMOUS_SAVE = 1;
	public static final int AUTONOMOUS_UPDATE = 1;

	public final static int CURL_START = 1;
	public final static int CURL_TURN = 2;
	public final static int CURL_FINISH_TURN = 3;

	public final static int COLLISION_DELAY_IN_MILLIS = 375;

}
