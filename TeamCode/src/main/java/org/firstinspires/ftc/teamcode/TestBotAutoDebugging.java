package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="Watch This Not Work", group="TestBot")

public class TestBotAutoDebugging extends OpMode {
    String frontRightMotorName = "FR";
    String backrightMotorName = "BR";
    String frontleftMotorName = "FL";
    String backleftMotorName = "BL";
    String colorSensorName = "color_sensor";
    //    String liftMotorName = "";


    //    DcMotor backRight = null;
//    DcMotor backLeft = null;
//    DcMotor frontRight = null;
//    DcMotor frontLeft = null;
    /* Declare OpMode members. */
    // use the class created to define a Testbot's hardware
    int state = 0;  // used to represent the current state in the state machine
    int initialPosition = 0;  // used to grab the position of a robot at the beginning of a move

    DcMotor backRight = null;
    DcMotor backLeft = null;
    DcMotor frontRight = null;
    DcMotor frontLeft = null;
    ColorSensor colorSensor = null;
    //       DcMotor liftMotor = hardwareMap.dcMotor.get(liftMotorName);

    /*
     * Code to run ONCE when the driver hits INIT
     */

    public void init() {
    }
//init();
//        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    // Initialize the hardware variables.
    //
    //}
    //
    //
    //
    //
    ///*
    //* Code to run ONCE when the driver hits PLAY
    //


    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    public void start() {
        {

            switch (state)

            {

                case 0:
                    setDirectionForwardColor();
                    state++;
                    break;


                case 1:
//                DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
//                DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
//                DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
//                DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
//                ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
//                if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200)
                    setDirectionForward(false, 1);
                    setDirectionLeft(1);
                    setDirectionRight(1);
                    state++;

                    break;
                case 2:
                    telemetry.addData("Complete", "It worked!");
                    telemetry.update();

                    break;
                // Drive Forward indefinitely
//            case 0:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(1);
//                //robot.arm.setPower(1);
//                state++;
//                break;
//            // Stop after set distance
//            case 1:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//
//
//            // Drive Backward indefinitely
//            case 2:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(0);
//                state++;
//                break;
//
//            // Stop After Set Distance
//            case 3:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//            case 4:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(1);
//                state++;
//                break;
//            // Stop after set distance
//            case 5:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//
//
//            // Drive Backward indefinitely
//            case 6:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(0);
//                state++;
//                break;
//
//            // Stop After Set Distance
//            case 7:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//            case 8:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(1);
//                state++;
//                break;
//            // Stop after set distance
//            case 9:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//
//
//            // Drive Backward indefinitely
//            case 10:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(0);
//                state++;
//                break;
//
//            // Stop After Set Distance
//            case 11:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//            case 12:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(1);
//                state++;
//                break;
//            // Stop after set distance
//            case 13:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;
//
//
//            // Drive Backward indefinitely
//            case 14:
//                robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                initialPosition = robot.leftDrive.getCurrentPosition();
//                robot.leftDrive.setPower(1);
//                robot.rightDrive.setPower(0);
//                state++;
//                break;
//
//            // Stop After Set Distance
//            case 15:
//                if ( (robot.leftDrive.getCurrentPosition() - initialPosition) > 5000 )
//                {
//                    robot.leftDrive.setPower(0.0);
//                    robot.rightDrive.setPower(0.0);
//                    state++;
//                }
//                break;

//            case 16:
//                robot.rightclaw.setPosition(0.5);
//                state++;
//
//                break;
//            case 17:
//                if ( (robot.rightclaw.GetPosition() - initialPosition) > 100)
//                {
//                    robot.rightclaw.setPosition(0);
//                    state++;
//                }
//                break;


                default:
                    break;

            }
            // telemetry.addData("4. Left Front Position: ", leftDrive.getCurrentPosition());
            //telemetry.addData("4. Arm Front Position: ", robot.arm.getCurrentPosition());
        }
    }

    @Override
    public void loop() {

    }

    public void setDirectionForward(boolean value, double time) { //time should be in milliseconds
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
//        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        if (value) {//forward

            backRight.setDirection(DcMotor.Direction.REVERSE);
            backLeft.setDirection(DcMotor.Direction.FORWARD);
            frontRight.setDirection(DcMotor.Direction.REVERSE);
            frontLeft.setDirection(DcMotor.Direction.FORWARD);
            backRight.setPower(1);
            backLeft.setPower(1);
            frontLeft.setPower(1);
            frontRight.setPower(1);
            /*if (time < ((System.currentTimeMillis()) / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);
            }*/
            double startTime = System.currentTimeMillis();
            //  while(opModeIsActive()){
            if ((System.currentTimeMillis() - startTime) >= (time / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);
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
            double startTime = System.currentTimeMillis();

            if ((System.currentTimeMillis() - startTime) >= (time / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);

            }


//            if (time < ((System.currentTimeMillis()) / 1000)) {
//                backLeft.setPower(0);
//                backRight.setPower(0);
//                frontLeft.setPower(0);
//                frontRight.setPower(0);
//            }
        }

    }

    public void setDirectionRight(double timeR) { //time should be in milliseconds
        //forward
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        // backLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        // frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setPower(1);
        // backLeft.setPower(1);
        // frontLeft.setPower(1);
        frontRight.setPower(1);
            /*if (time < ((System.currentTimeMillis()) / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);
            }*/
        double startTimeR = System.currentTimeMillis();

        if ((System.currentTimeMillis() - startTimeR) >= (timeR / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
        }

    }


//        else {//backward
//            backRight.setDirection(DcMotor.Direction.FORWARD);
//            backLeft.setDirection(DcMotor.Direction.REVERSE);
//            frontRight.setDirection(DcMotor.Direction.FORWARD);
//            frontLeft.setDirection(DcMotor.Direction.REVERSE);
//            backRight.setPower(-1);
//            frontLeft.setPower(-1);
//            frontRight.setPower(-1);
//            backLeft.setPower(-1);
//            if (time < ((System.currentTimeMillis()) / 1000)) {
//                backLeft.setPower(0);
//                backRight.setPower(0);
//                frontLeft.setPower(0);
//                frontRight.setPower(0);
//            }
//        }

    public void setDirectionLeft(double timeL) { //time should be in milliseconds
        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        //forward
        // backRight.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        // frontRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        // backRight.setPower(1);
        backLeft.setPower(1);
        frontLeft.setPower(1);
        // frontRight.setPower(1);
            /*if (time < ((System.currentTimeMillis()) / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);
            }*/
        double startTimeL = System.currentTimeMillis();

        if ((System.currentTimeMillis() - startTimeL) >= (timeL / 1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);

        }



        /*
         * Code to run ONCE after the driver hits STOP
         */
    }

    public void setDirectionForwardColor() { //time should be in milliseconds
        //forward


        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        ColorSensor colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        backRight.setDirection(DcMotor.Direction.FORWARD);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backRight.setPower(1);
        backLeft.setPower(1);
        frontLeft.setPower(1);
        frontRight.setPower(1);
            /*if (time < ((System.currentTimeMillis()) / 1000)) {
                backLeft.setPower(0);
                backRight.setPower(0);
                frontLeft.setPower(0);
                frontRight.setPower(0);
            }*/
//            double startTime = System.currentTimeMillis();
        //  while(opModeIsActive()){

        if (colorSensor.red() > 200 && colorSensor.blue() > 200 && colorSensor.green() > 200) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);



        }



//        else {//backward
//
//            backRight.setDirection(DcMotor.Direction.FORWARD);
//            backLeft.setDirection(DcMotor.Direction.REVERSE);
//            frontRight.setDirection(DcMotor.Direction.FORWARD);
//            frontLeft.setDirection(DcMotor.Direction.REVERSE);
//            backRight.setPower(-1);
//            frontLeft.setPower(-1);
//            frontRight.setPower(-1);
//            backLeft.setPower(-1);
//            double startTime = System.currentTimeMillis();
//
//            if ((System.currentTimeMillis() - startTime) >= (time/1000)){
//                backLeft.setPower(0);
//                backRight.setPower(0);
//                frontLeft.setPower(0);
//                frontRight.setPower(0);
//
//            }
//

//            if (time < ((System.currentTimeMillis()) / 1000)) {
//                backLeft.setPower(0);
//                backRight.setPower(0);
//                frontLeft.setPower(0);
//                frontRight.setPower(0);
//
//      }

    }

}




