package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class AlbusAutonomous extends LinearOpMode {

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
        waitForStart();
        while (opModeIsActive()) {
            drop();
            moveForward(5);
            senseJewels();
            depositTeamMarker();
            moveBackward(5);


        }

    }

    public void moveForward(double time) {
        resetStartTime();
        backLeft.setPower(1);
        backRight.setPower(1);
        frontLeft.setPower(1);
        frontRight.setPower(1);
        if (time < 1000 * (System.currentTimeMillis())) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
        }
    }

    public void drop() throws InterruptedException {

        liftMotor.setPower(1);
        wait(2000);
        liftMotor.setPower(0);
        liftServo.setPosition(1);
    }

    public void depositTeamMarker() {
        //depositing servo.setPosition(1);


    }

    public void senseJewels() {

    }

    public void moveBackward(double time) {
        resetStartTime();
        backLeft.setPower(-1);
        backRight.setPower(-1);
        frontLeft.setPower(-1);
        frontRight.setPower(-1);
        if (time < (1000 * (System.currentTimeMillis()))) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);

        }
    }
}
