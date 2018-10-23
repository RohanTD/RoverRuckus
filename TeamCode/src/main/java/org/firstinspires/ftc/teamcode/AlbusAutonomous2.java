package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;

@Autonomous (name = "AlbusAutonomousNew1", group = "TestBot")
public class AlbusAutonomous2 extends LinearOpMode {

    // String liftServoName = "lift_servo";
//    String frontRightMotorName = "FR";
//    String backrightMotorName = "BR";
//    String frontleftMotorName = "FL";
//    String backleftMotorName = "BL";
//    String colorSensorName = "color_sensor";
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

        backRight = hardwareMap.dcMotor.get(backrightMotorName);
        backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        //       DcMotor liftMotor = hardwareMap.dcMotor.get(liftMotorName);
        //       DcMotor turnArm = hardwareMap.dcMotor.get(turnArmName);
        waitForStart();
        while (opModeIsActive()) {
            //      drop();

            if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
                setDirectionForward(false, 1000);
                turn(false,500);
                turn(true,500);
                if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
                    setDirectionForward(false, 1000);
                    turn(false,500);
                    turn(true,500);
                    setDirectionForward(true,400);



                }
                else {
                    setDirectionForward(true,400);
                }


            }
            else{
                setDirectionForward(true,400);
            }

        }


    }

//
//    private void makeStop(double time) {
//        if (time < ((System.currentTimeMillis()) / 1000)) {
//            backLeft.setPower(0);
//            backRight.setPower(0);
//            frontLeft.setPower(0);
//            frontRight.setPower(0);
//        }
//    }
//
//    private void resetFullPower() {
//        backLeft.setPower(1);
//        backRight.setPower(1);
//        frontLeft.setPower(1);
//        frontRight.setPower(1);
//
//    }

    private void setDirectionForward(boolean value, double time) { //time should be in milliseconds
        double startTime = System.currentTimeMillis();
        if (value) {//forward
            telemetry.addData("forward", "starting");
            telemetry.update();
            backRight.setDirection(DcMotor.Direction.REVERSE);
            backLeft.setDirection(DcMotor.Direction.FORWARD);
            frontRight.setDirection(DcMotor.Direction.REVERSE);
            frontLeft.setDirection(DcMotor.Direction.FORWARD);
            backRight.setPower(-1);
            backLeft.setPower(-1);
            frontLeft.setPower(-1);
            frontRight.setPower(-1);


            while (opModeIsActive()) {
                if ((System.currentTimeMillis() - startTime) >= time) {
                    backLeft.setPower(0);
                    backRight.setPower(0);
                    frontLeft.setPower(0);
                    frontRight.setPower(0);
                    telemetry.addData("stopped", "moving on");
                    telemetry.update();
                    break;
                }
            }

        } else {//backward
            backRight.setDirection(DcMotor.Direction.FORWARD);
            backLeft.setDirection(DcMotor.Direction.REVERSE);
            frontRight.setDirection(DcMotor.Direction.FORWARD);
            frontLeft.setDirection(DcMotor.Direction.REVERSE);
            backRight.setPower(-1);
            frontLeft.setPower(-1);
            frontRight.setPower(-1);
            backLeft.setPower(-1);

            while (opModeIsActive()) {
                if ((System.currentTimeMillis() - startTime) >= time) {
                    backLeft.setPower(0);
                    backRight.setPower(0);
                    frontLeft.setPower(0);
                    frontRight.setPower(0);
                    break;


                }


            }
        }
    }

//    public void moveForward(double time) {
////        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
////        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
////        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
////        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
//        resetStartTime();
//        telemetry.addData("Color is sensed", "Good Job");
//        telemetry.update();
//        backLeft.setPower(1);
//        backRight.setPower(1);
//        frontLeft.setPower(1);
//        frontRight.setPower(1);
//        if (time < ((System.currentTimeMillis()) / 1000)) {
//            backLeft.setPower(0);
//            backRight.setPower(0);
//            frontLeft.setPower(0);
//            frontRight.setPower(0);
//        }
//    }
//
//    //  public void drop() throws InterruptedException {
//
//    //     liftMotor.setPower(1);
//    //   wait(2000);
//    // liftMotor.setPower(0);
//    //  liftServo.setPosition(1);
////    }
//
//    public void depositTeamMarker() {
//        //depositing servo.setPosition(1);
//
//
//    }
//
//    public void senseJewels() {
//        if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
//            moveBackward(1.5);
//            turnRight(0.5);
//            turnLeft(0.5);
//            if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
//                moveBackward(1.5);
//                turnRight(0.5);
//                turnLeft(0.5);
//                if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
//                    moveBackward(1.5);
//                    turnRight(0.5);
//                    turnLeft(0.5);
//
//                } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
//                    moveForward(0.25);
//                }
//
//
//            } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
//                moveForward(0.25);
//            }
//
//        } else if (colorSensor.red() > 200 && colorSensor.green() > 200 && colorSensor.blue() < 200) {
//            moveForward(0.25);
//        }
//
//
//    }
//
//
//    public void moveBackward(double time) {
////        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
////        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
////        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
////        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
//        resetStartTime();
//        telemetry.addData("Its Moving Backward", "Good Job");
//        setDirectionForward(false, 1500);
//        backLeft.setPower(1);
//        backRight.setPower(1);
//        frontLeft.setPower(1);
//        frontRight.setPower(1);
//
//
//
//    }


    //
//            }
////        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
////        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
////        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
////        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
    public void turn(boolean valueT, double timeT) {
        double startTimeT = System.currentTimeMillis();
        backRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.FORWARD);

        if (valueT) {
            telemetry.addData("Turning Right", "Good Job");
            telemetry.update();
            backLeft.setPower(0);
            backRight.setPower(-1);
            frontLeft.setPower(0);
            frontRight.setPower(-1);
            while (opModeIsActive()) {
                if ((System.currentTimeMillis() - startTimeT) >= timeT) {
                    backLeft.setPower(0);
                    backRight.setPower(0);
                    frontLeft.setPower(0);
                    frontRight.setPower(0);
                    break;


                }
            }
        }
        else{
            telemetry.addData("Turning Left", "Good Job");
            telemetry.update();
            backLeft.setPower(-1);
            backRight.setPower(0);
            frontLeft.setPower(-1);
            frontRight.setPower(0);
            while (opModeIsActive()) {
                if ((System.currentTimeMillis() - startTimeT) >= timeT) {
                    backLeft.setPower(0);
                    backRight.setPower(0);
                    frontLeft.setPower(0);
                    frontRight.setPower(0);
                    break;


                }
            }
        }
    }
//        telemetry.addData("Turning Right", "Good Job");
//        telemetry.update();
//        resetStartTime();
//        backLeft.setPower(1);
//        backRight.setPower(0);
//        frontLeft.setPower(1);
//        frontRight.setPower(0);
//
//    }
//
//    public void turnLeft(double time) {
//        telemetry.addData("Turning Left", "Good Job");
//        telemetry.update();
//        resetStartTime();
//        backLeft.setPower(0);
//        backRight.setPower(1);
//        frontLeft.setPower(0);
//        frontRight.setPower(1);
//    }

//    public void delay(double delayTime) {
//        double startTime = System.currentTimeMillis(); //500
//        while (System.currentTimeMillis() - startTime < delayTime) {
//            telemetry.addData("Robot is waiting", System.currentTimeMillis() - startTime);
//            telemetry.update();
//        }
//    }
//    public void goForwardTime(double time) {
//        telemetry.addData("Going Forward", "Good Job");
//        telemetry.update();
//        resetStartTime();
//        backRight.setPower(1);
//        backLeft.setPower(1);
//        backLeft.setPower(1);
//        backRight.setPower(1);
//    }


}
