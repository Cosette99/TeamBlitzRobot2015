package org.usfirst.frc2083.TeamBlitzRobot2015.commands;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
	  static final boolean auto = false;
	public static final int leftOffset = 0;
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController rightDriveSubsystemRightFrontMotor;
    public static SpeedController rightDriveSubsystemRightRearMotor;
    public static SpeedController gripperLeftMotorController;
    public static SpeedController gripperRightMotorController;
    public static SpeedController fourBarLifterLinearActuator;
    public static SpeedController leftDriveSubsystemLeftFrontMotor;
    public static SpeedController leftDriveSubsystemLeftRearMotor;
	public static int rightOffset;
	public static Object RightFrontSubsystem;
	public static Object LeftFrontSubsystem;
	public static Object rightFront;
	public static Object leftFront;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rightDriveSubsystemRightFrontMotor = new Jaguar(1);
        LiveWindow.addActuator("Right Drive Subsystem", "Right Front Motor", (Jaguar) rightDriveSubsystemRightFrontMotor);
        
        rightDriveSubsystemRightRearMotor = new Jaguar(8);
        LiveWindow.addActuator("Right Drive Subsystem", "Right Rear Motor", (Jaguar) rightDriveSubsystemRightRearMotor);
        
        gripperLeftMotorController = new Jaguar(5);
        LiveWindow.addActuator("Gripper", "Left Motor Controller", (Jaguar) gripperLeftMotorController);
        
        gripperRightMotorController = new Jaguar(2);
        LiveWindow.addActuator("Gripper", "Right Motor Controller", (Jaguar) gripperRightMotorController);
        
        fourBarLifterLinearActuator = new Talon(0);
        LiveWindow.addActuator("Four Bar Lifter", "Linear Actuator", (Talon) fourBarLifterLinearActuator);
        
        leftDriveSubsystemLeftFrontMotor = new Jaguar(2);
        LiveWindow.addActuator("Left Drive Subsystem", "Left Front Motor", (Jaguar) leftDriveSubsystemLeftFrontMotor);
        
        leftDriveSubsystemLeftRearMotor = new Jaguar(7);
        LiveWindow.addActuator("Left Drive Subsystem", "Left Rear Motor", (Jaguar) leftDriveSubsystemLeftRearMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
