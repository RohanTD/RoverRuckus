package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class Pushbot1Instructor extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //init
        // i.e set up motors
        String frontRightMotorName = "FRM";
        String backRightMotorName = "BRM";
        String frontLeftMotorName = "FLM";
        String backLeftMotorName = "BLM";

        String pusherServoName = "PS";

        Servo pusherServo = hardwareMap.servo.get(pusherServoName);

        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor backRight = hardwareMap.dcMotor.get(backRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontLeftMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backLeftMotorName);

        Gamepad g1 = gamepad1;

        waitForStart(); //wait for start on phone

        //after you press start
        while (opModeIsActive()){
            //run constantly till you stop
            //i.e update motor speeds w/ joystick

            pusherServo.setPosition(g1.right_trigger);

            frontRight.setPower(-g1.right_stick_y);
            backRight.setPower(-g1.right_stick_y);
            frontLeft.setPower(-g1.left_stick_y);
            backLeft.setPower(-g1.left_stick_y);
        }
        //runs when you press stop
        //i.e stop all motors
        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
        pusherServo.setPosition(0);
    }
}
