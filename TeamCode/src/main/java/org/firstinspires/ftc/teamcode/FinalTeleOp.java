package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class FinalTeleOp extends LinearOpMode {

    String liftServoName = "lift_servo";
    String frontRightMotorName = "front_right";
    String backrightMotorName = "right_drive";
    String frontleftMotorName = "front_left";
    String backleftMotorName = "left_drive";
    String liftMotorName = "lift_motor";
    String turnArmName = "turn_arm";

    Servo liftServo = hardwareMap.servo.get(liftServoName);

    DcMotor backRight = null;
    DcMotor backLeft = null;
    DcMotor frontRight = null;
    DcMotor frontLeft = null;
    DcMotor liftMotor = null;
    DcMotor turnArm = null;

    Gamepad g1 = gamepad1;
    Gamepad g2 = gamepad2;
    @Override
    public void runOpMode() throws InterruptedException {
        //init
        //i.e. set up motors
        String liftServoName = "lift_servo";
        String frontRightMotorName = "front_right";
        String backrightMotorName = "right_drive";
        String frontleftMotorName = "front_left";
        String backleftMotorName = "left_drive";
        String liftMotorName = "lift_motor";
        String turnArmName = "turn_arm";

        Servo liftServo = hardwareMap.servo.get(liftServoName);

        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        DcMotor liftMotor = hardwareMap.dcMotor.get(liftMotorName);
        DcMotor turnArm = hardwareMap.dcMotor.get(turnArmName);

        Gamepad g1 = gamepad1;
        Gamepad g2 = gamepad2;

        waitForStart(); //wait for start on phone


        //after you press start
        while (opModeIsActive()) {

            if (g2.a) {
                drop();
            }



            frontRight.setPower(g1.right_stick_y);
            backRight.setPower(g1.right_stick_y);
            frontLeft.setPower(g1.left_stick_y);
            backLeft.setPower(g1.left_stick_y);

            liftMotor.setPower(g2.right_stick_y);
            turnArm.setPower(g2.left_stick_x);




            // /run constantly till you stop
            //i.e. update motor speeds w/ joystick



            //runs when you press stop
            //i.e. stop all motors
            frontRight.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            backLeft.setPower(0);
            liftServo.setPosition(0);
            liftMotor.setPower(0);
            turnArm.setPower(0);


        }
    }
    public void drop(){
        liftServo.setPosition(1);

    }
}