package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class testBot929 extends LinearOpMode {
    motorsAndStuff robot;


    @Override
    public void runOpMode() throws InterruptedException {
        robot = new motorsAndStuff(this);
        String frm = "FRM";
        String flm = "FLM";
        String brm = "BRM";
        String blm = "BLM";
        robot.addMotor("FRM");
        robot.addMotor("FLM");
        robot.addMotor("BRM");
        robot.addMotor("BLM");

        waitForStart();
        while (opModeIsActive()) {
            robot.motors.get("FRM").setPower(gamepad1.right_stick_y);
            robot.motors.get("BRM").setPower(gamepad1.right_stick_y);
            robot.motors.get("BLM").setPower(gamepad1.left_stick_y);
            robot.motors.get("FLM").setPower(gamepad1.left_stick_y);
        }
        robot.terminate();

    }
}
