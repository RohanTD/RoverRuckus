package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp (name = "AlbusTeleop", group = "TestBot")
public class AlbusTeleop extends LinearOpMode {


    //Servo liftServo = hardwareMap.servo.get(liftServoName);

    DcMotor backRight = null;
    DcMotor backLeft = null;
    DcMotor frontRight = null;
    DcMotor frontLeft = null;
    DcMotor armMotor = null;
    DcMotor collector = null;

    Gamepad g1 = gamepad1;
    Gamepad g2 = gamepad2;
    boolean previousStateOfA = false;
    boolean PreviousStateOfX = false;

    @Override
    public void runOpMode() throws InterruptedException {
        //init
        //i.e. set up motors
        String liftServoName = "lift_servo";
        String frontRightMotorName = "front_right";
        String backrightMotorName = "back_right";
        String frontleftMotorName = "front_left";
        String backleftMotorName = "back_left";
        String armMotorName = "arm_lifter";
        String collectorName = "collector";

        //       Servo liftServo = hardwareMap.servo.get(liftServoName);

        DcMotor backRight = hardwareMap.dcMotor.get(backrightMotorName);
        DcMotor backLeft = hardwareMap.dcMotor.get(backleftMotorName);
        DcMotor frontRight = hardwareMap.dcMotor.get(frontRightMotorName);
        DcMotor frontLeft = hardwareMap.dcMotor.get(frontleftMotorName);
        DcMotor armMotor = hardwareMap.dcMotor.get(armMotorName);
        DcMotor collector = hardwareMap.dcMotor.get(collectorName);

        Gamepad g1 = gamepad1;
        Gamepad g2 = gamepad2;



        waitForStart(); //wait for start on phone


        //after you press start
        while (opModeIsActive()) {

            //   if (g2.a) {
            //     drop();


            frontRight.setPower(g1.right_stick_y);
            backRight.setPower(g1.right_stick_y);
            frontLeft.setPower(g1.left_stick_y);
            backLeft.setPower(g1.left_stick_y);

            armMotor.setPower(g2.left_stick_y);
            collector.setPower(g2.right_stick_y);


            // /run constantly till you stop
            //i.e. update motor speeds w/ joystick


            //runs when you press stop
            //i.e. stop all motors
            frontRight.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            backLeft.setPower(0);
            //   liftServo.setPosition(0);
            armMotor.setPower(0);
            collector.setPower(0);
        }


    }

    public void deposit() {
        PreviousStateOfX = g2.x;
        motorMover(collector);
        moveBackward(0.5);
        motorMover(armMotor);
        motorMoverBack(collector);
        motorMoverBack(armMotor);





        }



    public void moveForward(double time) {
        resetStartTime();
        backLeft.setPower(-1);
        backRight.setPower(1);
        frontLeft.setPower(-1);
        frontRight.setPower(1);
        if (time <(  (System.currentTimeMillis())/1000)) {
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);
        }
    }
    public void moveBackward(double time) {
        resetStartTime();
        backLeft.setPower(1);
        backRight.setPower(-1);
        frontLeft.setPower(1);
        frontRight.setPower(-1);
        if (time < ( (System.currentTimeMillis())/1000) ){
            backLeft.setPower(0);
            backRight.setPower(0);
            frontLeft.setPower(0);
            frontRight.setPower(0);

        }
    }
    public void motorMover(DcMotor motor) {
        PreviousStateOfX = g2.x;
        motor.setPower(1);
        if (g2.x && PreviousStateOfX != false) {
            motor.setPower(0);
        }
    }
    public void motorMoverBack(DcMotor motor) {
        PreviousStateOfX = g2.x;
        motor.setPower(-1);
        if (g2.x && PreviousStateOfX != false) {
            motor.setPower(0);
        }
    }

}
  //  public void drop(){
    //    liftServo.setPosition(1);


