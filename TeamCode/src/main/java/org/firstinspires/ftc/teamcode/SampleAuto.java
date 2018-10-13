package org.firstinspires.ftc.teamcode;

import android.text.method.Touch;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class SampleAuto extends LinearOpMode {

    String dropServoName = "DS";
    String touchSensorName = "TS";
    String colorSensorName = "CS";
    String leftMotorName = "LM";
    String rightMotorName = "RM";

    Servo dropServo = null;
    TouchSensor tsensor = null;
    ColorSensor colorSensor = null;
    DcMotor rightMotor = null;
    DcMotor leftMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {
        String dropServoName = "DS";
        String touchSensorName = "TS";
        String colorSensorName = "CS";

       dropServo = hardwareMap.servo.get(dropServoName);
        tsensor = hardwareMap.touchSensor.get(touchSensorName);
        colorSensor = hardwareMap.colorSensor.get(colorSensorName);
        rightMotor = hardwareMap.dcMotor.get(rightMotorName);
        leftMotor = hardwareMap.dcMotor.get(leftMotorName);


        waitForStart();
        dropServo.setPosition(0); //assumes 0 is "closed"


        while (opModeIsActive()) {
            if (tsensor.isPressed()){
                dropServo.setPosition(1); //"open"
            }

            double rVal = colorSensor.red();
            double bVal = colorSensor.blue();
            double gVal = colorSensor.green();

            if (rVal > 200 && gVal > 200 && bVal < 200){
                //yellow
                //push forward
                goForwardTime(5000);
            } else if (rVal > 200 && gVal > 200 && bVal > 200) {
                //white
                //move to next jewel
            }

            delay(3000);
            //dropServo.setPosition(1); //assumes 1 is "open"
        }



    }
    public void goForwardTime(double time) {
        rightMotor.setPower(1);
        leftMotor.setPower(-1);
        delay(time);
        rightMotor.setPower(0);
        leftMotor.setPower(0);
    }

    public void delay(double delayTime){
        double startTime = System.currentTimeMillis(); //500
        while (System.currentTimeMillis() - startTime < delayTime) {
            telemetry.addData("Robot is waiting", System.currentTimeMillis() - startTime);
            telemetry.update();
        }
    }
}
