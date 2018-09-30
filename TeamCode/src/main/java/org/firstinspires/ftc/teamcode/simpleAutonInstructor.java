package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;


public class simpleAutonInstructor extends LinearOpMode {

    String rightMotorName = "RM";
    String leftMotorName = "LM";

    String dropServoName = "DS";
    String touchSensorName = "TS";
    String colorSensorName = "CS";

    DcMotor rightMotor = null;
    DcMotor leftMotor = null;

    Servo dropServo = null;
    TouchSensor tSensor = null;
    ColorSensor cSensor = null;

    @Override
    public void runOpMode() throws InterruptedException {
        dropServo = hardwareMap.servo.get(dropServoName);
        tSensor = hardwareMap.touchSensor.get(touchSensorName);
        cSensor = hardwareMap.colorSensor.get(colorSensorName);

        rightMotor = hardwareMap.dcMotor.get(rightMotorName);
        leftMotor = hardwareMap.dcMotor.get(leftMotorName);

        waitForStart();
        dropServo.setPosition(0); //assumes 0 is "closed"
        while (opModeIsActive()){
            if (tSensor.isPressed()){
                dropServo.setPosition(1); //"open"
            } else {
                dropServo.setPosition(0); //"closed"
            }

            double rVal = cSensor.red();
            double gVal = cSensor.green();
            double bVal = cSensor.blue();

            if (rVal > 175 && gVal > 175 && bVal < 100){
                //yellow
                //move forward
                goForwardTime(5000);
                //push forward
            } else if (rVal > 200 && gVal > 200 && bVal > 200){
                //white
                // do nothing
            }

            //delay(3000);
            //dropServo.setPosition(1); //assumes 1 is "open"
        }
    }

    public void goForwardTime(double time){
        rightMotor.setPower(1);
        leftMotor.setPower(-1);
        delay(time);
        rightMotor.setPower(0);
        leftMotor.setPower(0);
    }

    public void delay(double delayTime){
        double startTime = System.currentTimeMillis(); //500
        while((System.currentTimeMillis() - startTime) < delayTime){
            telemetry.addData("Robot is waiting",System.currentTimeMillis() - startTime);
            telemetry.update();
        }
    }
}
