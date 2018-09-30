package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class TestBot1Instructor extends LinearOpMode {
    motorsAndStuff robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new motorsAndStuff(this);
        String frm = "FRM";
        String flm = "FLM";
        String brm = "BRM";
        String blm = "BLM";
        robot.addMotor(frm);
        robot.addMotor(flm);
        robot.addMotor(brm);
        robot.addMotor(blm);
        waitForStart();
        while(opModeIsActive()) {
            robot.motors.get(frm).setPower(gamepad1.right_stick_y);
            robot.motors.get(flm).setPower(-gamepad1.left_stick_y);
            robot.motors.get(brm).setPower(gamepad1.right_stick_y);
            robot.motors.get(blm).setPower(-gamepad1.left_stick_y);
        }
        robot.terminate();
    }
}