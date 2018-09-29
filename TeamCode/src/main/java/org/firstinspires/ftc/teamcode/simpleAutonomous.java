package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.robot.Robot;

public class simpleAutonomous extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        String dropMotorName = "DM";

        DcMotor dropMotor = hardwareMap.dcMotor.get(dropMotorName);
        waitForStart();
        dropMotor.setPower(0);

        while (opModeIsActive()   )
        {
            delay(5000);
            dropMotor.setPower(0.25);
        }

    }


    public void delay(double delayTime) {
        double startTime = System.currentTimeMillis(); //500
        while (System.currentTimeMillis() - startTime < delayTime) {
            telemetry.addData("Robot is waiting", System.currentTimeMillis() - startTime);
            telemetry.update();
        }

    }
}