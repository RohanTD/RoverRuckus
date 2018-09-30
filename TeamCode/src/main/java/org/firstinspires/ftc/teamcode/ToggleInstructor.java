package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class ToggleInstructor extends LinearOpMode {
    String servoName = "testServo";
    Servo testServo = null;

    int state = 0;
    boolean previousStateOfA = false;

    @Override
    public void runOpMode() throws InterruptedException {
        testServo = hardwareMap.servo.get(servoName);
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a && previousStateOfA != gamepad1.a){
                if (state < 3) {
                    state++;
                } else {
                    state = 0;
                }
            }
            previousStateOfA = gamepad1.a;
            switch (state) {
                case 0:
                    //one thing
                    break;
                case 1:
                    //another thing
                    break;
                case 2:
                    //another thing
                    break;
                case 3:
                    //another thing
                    break;
                default:
                    //last thing
                    break;
            }
        }
    }
}
