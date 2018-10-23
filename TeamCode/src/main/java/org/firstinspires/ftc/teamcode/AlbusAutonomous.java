package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;

@Autonomous (name = "AlbusAutonomous", group = "TestBot")
public class AlbusAutonomous extends LinearOpMode {

    // String liftServoName = "lift_servo";
    String frontRightMotorName = "FR";
    String backrightMotorName = "BR";
    String frontleftMotorName = "FL";
    String backleftMotorName = "BL";
    String colorSensorName = "color_sensor";
//    String liftMotorName = "";
    //  String turnArmName = "";

    //  Servo liftServo = hardwareMap.servo.get(liftServoName);

    DcMotor backRight = null;
    DcMotor backLeft = null;
    DcMotor frontRight = null;
    DcMotor frontLeft = null;
boolean previousState = false;
    //   DcMotor liftMotor = null;
    // DcMotor turnArm = null;

    //   Gamepad g1 = gamepad1;
    // Gamepad g2 = gamepad2;
    ColorSensor colorSensor = null;
    @Override
    public void runOpMode() throws InterruptedException {
        //String liftServoName = "lift_servo";
        String frontRightMotorName = "FR";
        String backrightMotorName = "BR";
        String frontleftMotorName = "FL";
        String backleftMotorName = "BL";
        String colorSensorName = "color_sensor";
        //      String liftMotorName = "lift_motor";
        //    String turnArmName = "turn_arm";

        //     Servo liftServo = hardwareMap.servo.get(liftServoName);

        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        //       DcMotor liftMotor = hardwareMap.dcMotor.get(liftMotorName);
        //       DcMotor turnArm = hardwareMap.dcMotor.get(turnArmName);
        waitForStart();
        while (opModeIsActive()) {
            //      drop();



            }



        }




    public void moveForward(double time) {
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        resetStartTime();
        backLeft.setPower(-1);
        backRight.setPower(1);
        frontLeft.setPower(-1);
        frontRight.setPower(1);
        if (time < ((System.currentTimeMillis()) / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
        }
    }

    //  public void drop() throws InterruptedException {

    //     liftMotor.setPower(1);
    //   wait(2000);
    // liftMotor.setPower(0);
    //  liftServo.setPosition(1);
//    }

    public void depositTeamMarker() {
        //depositing servo.setPosition(1);


    }

    public void senseJewels() {
        if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
            moveBackward(1.5);
            turnRight(0.5);
            turnLeft(0.5);
            if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
                moveBackward(1.5);
                turnRight(0.5);
                turnLeft(0.5);
                if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
                    moveBackward(1.5);
                    turnRight(0.5);
                    turnLeft(0.5);

                } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
                    moveForward(0.25);
                }


            } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
                moveForward(0.25);
            }

        } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
            moveForward(0.25);
        }


    }


    public void moveBackward(double time) {
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        resetStartTime();
        backLeft.setPower(1);
        backRight.setPower(-1);
        frontLeft.setPower(1);
        frontRight.setPower(-1);
        if (time < ((System.currentTimeMillis()) / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);


        }
    }

    public void turnRight(double time) {
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        resetStartTime();
        backLeft.setPower(-1);
        backRight.setPower(0);
        frontLeft.setPower(-1);
        frontRight.setPower(0);
        if (time < ((System.currentTimeMillis()) / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);


        }
    }

    public void turnLeft(double time) {
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        resetStartTime();
        backLeft.setPower(0);
        backRight.setPower(1);
        frontLeft.setPower(0);
        frontRight.setPower(1);
        if (time < ((System.currentTimeMillis()) / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);


        }
    }

    public void delay(double delayTime) {
        double startTime = System.currentTimeMillis(); //500
        while (System.currentTimeMillis() - startTime < delayTime) {
            telemetry.addData("Robot is waiting", System.currentTimeMillis() - startTime);
            telemetry.update();
        }
    }
    public void goForwardTime(double time) {
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        backRight.setPower(1);
        backLeft.setPower(-1);
        delay(time);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

}