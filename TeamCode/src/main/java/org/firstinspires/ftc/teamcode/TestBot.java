package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a TestBot.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 */
public class TestBot
{
    /* Public OpMode members. */
    public DcMotor  leftDrive   = null;
    public DcMotor  rightDrive  = null;
    public DcMotor  arm     = null;
    public DcMotor  front_left    = null;
    public DcMotor  front_right  =null;


    //public Servo leftclaw  = null;
    //public Servo    rightclaw = null;
    //public SensorREVColorDistance ColorSensor = null;


    /* local OpMode members. */
    HardwareMap hwMap           =  null;

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftDrive  = hwMap.get(DcMotor.class, "left_drive");
        rightDrive = hwMap.get(DcMotor.class, "right_drive");
        arm = hwMap.get(DcMotor.class, "arm");
        front_left = hwMap.get(DcMotor.class, "front_left" );
        front_right = hwMap.get(DcMotor.class, "front_right" );
        //leftclaw = hwMap.get(Servo.class, "left_claw");
        //rightclaw = hwMap.get(Servo.class,"right_claw" );
        //ColorSensor = hwMap.get(SensorREVColorDistance.class, "sensor_color_distance");
        leftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightDrive.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        arm.setDirection(DcMotor.Direction.FORWARD);
        front_left.setDirection(DcMotor.Direction.FORWARD);
        front_right.setDirection(DcMotor.Direction.FORWARD);




        // Set all motors to zero power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        arm.setPower(0);
        front_left.setPower(0);
        front_right.setPower(0);

        //leftclaw.setPosition(0);
        //rightclaw.setPosition(1);




    }
}

