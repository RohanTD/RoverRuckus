package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;


public class Pushbot1 extends LinearOpMode{

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();  // wait for start
        String rightMotorName = "RM";
        String leftMotorName = "LM";
        String frontRightMotorName = "FRM";
        String frontLeftMotorName = "FLM";

        String pusherServoName = "PS";
        Servo pusherServo = hardwareMap.servo.get(pusherServoName);



        DcMotor rightMotor = hardwareMap.dcMotor.get(rightMotorName);
        DcMotor leftMotor = hardwareMap.dcMotor.get(leftMotorName);
        DcMotor frontRightMotor = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeftMotor = hardwareMap.dcMotor.get(frontLeftMotorName);



        Gamepad g1 = gamepad1;






        while (opModeIsActive())
        {
            rightMotor.setPower(g1.right_stick_y);
            leftMotor.setPower(g1.left_stick_y);
            frontRightMotor.setPower(g1.right_stick_y);
            frontLeftMotor.setPower(g1.left_stick_y);
            pusherServo.setPosition(g1.right_trigger);
            //run constantly till you stop
            //i.e update motor speeds with joystick
        }
        //runs when you press stop
        //i.e stop all motors
        rightMotor.setPower(0);
        leftMotor.setPower(0);
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);


    }
}


