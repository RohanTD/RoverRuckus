package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp (name = "OneMotor", group = "TestBot")
public class OneMotor extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        String collectorMotorName = "collector";

        DcMotor collectorMotor = hardwareMap.dcMotor.get(collectorMotorName);

        waitForStart();

        while (opModeIsActive()) {
            collectorMotor.setPower(gamepad1.left_stick_y);
        }
    }
}
