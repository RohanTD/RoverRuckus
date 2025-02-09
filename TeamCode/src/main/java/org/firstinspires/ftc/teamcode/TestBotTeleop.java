package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * This file provides basic Telop driving for a TestBot robot.
 * The code is structured as an OpMode
 *
 * This OpMode uses the common TestBot hardware class to define the devices on the robot.
 * All device access is managed through the TestBot class.
 *
 * This particular OpMode executes a basic Tank Drive Teleop for a TestBot
\ * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@TeleOp(name="TestBot: Teleop Tank", group="TestBot")
public class TestBotTeleop extends OpMode
{

    /* Declare OpMode members. */
    TestBot robot = new TestBot(); // use the class created to define a Pushbot's hardware

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "Hello Driver");    //
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        float left;
        float right;
        float arm;
        float leftservo;
        float rightservo;
        float front_right;
        float front_left;
//        double leftPower;
//        double rightPower;



        // Run wheels in tank mode (note: The joystick goes negative when pushed forwards, so negate it)
        left = gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        //leftservo = gamepad2.left_trigger;
        //rightservo = gamepad2.right_trigger;
         arm = -gamepad2.left_stick_x;
         front_left = gamepad2.left_stick_y;
         front_right = gamepad2.right_stick_y;






        robot.leftDrive.setPower(left);
        robot.rightDrive.setPower(right);
        robot.arm.setPower(arm);
        //robot.rightclaw.setPosition(rightservo);
        //robot.leftclaw.setPosition(leftservo);
        robot.front_left.setPower(front_left);
        robot.front_right.setPower(front_right);



        // Send telemetry message to signify robot running;
        telemetry.addData("left",  "%.2f", left);

    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
