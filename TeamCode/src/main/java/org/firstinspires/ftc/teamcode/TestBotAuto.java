package org.firstinspires.ftc.teamcode;//package org.firstinspires.ftc.teamcode;
//
//import android.app.Activity;
//import android.view.View;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.ColorSensor;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.DistanceSensor;
//
//@Autonomous(name="TestBot: Auto with State Machine Color Sensor", group="TestBot")
//
//public class TestBotAuto extends OpMode {
//    /* Declare OpMode members. */
//    TestBot robot = new TestBot(); // use the class created to define a Testbot's hardware
//    int state = 0;  // used to represent the current state in the state machine
//    int initialPosition = 0;  // used to grab the position of a robot at the beginning of a move
//    ColorSensor sensorColor;
//    DistanceSensor sensorDistance;
//
//    /*
//     * Code to run ONCE when the driver hits INIT
//     */
//
//    public void runOpMode() {
//        sensorColor = hardwareMap.get(ColorSensor.class, "sensor_color_distance");
//
//        // get a reference to the distance sensor that shares the same name.
//        sensorDistance = hardwareMap.get(DistanceSensor.class, "sensor_color_distance");
//
//        // hsvValues is an array that will hold the hue, saturation, and value information.
//        float hsvValues[] = {0F, 0F, 0F};
//
//        final float values[] = hsvValues;
//
//        // sometimes it helps to multiply the raw RGB values with a scale factor
//        // to amplify/attentuate the measured values.
//        final double SCALE_FACTOR = 255;
//
//        // get a reference to the RelativeLayout so we can change the background
//        // color of the Robot Controller app to match the hue detected by the RGB sensor.
//        int relativeLayoutId = hardwareMap.appContext.getResources().getIdentifier("RelativeLayout", "id", hardwareMap.appContext.getPackageName());
//        final View relativeLayout = ((Activity) hardwareMap.appContext).findViewById(relativeLayoutId);
//
//        // wait for the start button to be pressed.
//        //waitForStart();
//        //@Override
//        public void start ()
//        }
//
//        // loop and read the RGB and distance data.
//        // Note we use opModeIsActive() as our loop condition because it is an interruptible method.
////        while (opModeIsActive())
////        {
////            // convert the RGB values to HSV values.
////            // multiply by the SCALE_FACTOR.
////            // then cast it back to int (SCALE_FACTOR is a double)
////            Color.RGBToHSV((int) (sensorColor.red() * SCALE_FACTOR),
////                    (int) (sensorColor.green() * SCALE_FACTOR),
////                    (int) (sensorColor.blue() * SCALE_FACTOR),
////                    hsvValues);
////
////            // send the info back to driver station using telemetry function.
////            telemetry.addData("Distance (cm)",
////                    String.format(Locale.US, "%.02f", sensorDistance.getDistance(DistanceUnit.CM)));
////            telemetry.addData("Alpha", sensorColor.alpha());
////            telemetry.addData("Red  ", sensorColor.red());
////            telemetry.addData("Green", sensorColor.green());
////            telemetry.addData("Blue ", sensorColor.blue());
////            telemetry.addData("Hue", hsvValues[0]);
////
////
////            /* Initialize the hardware variables.
////             * The init() method of the hardware class does all the work here
////             */
////            robot.init(hardwareMap);
////
////            // Send telemetry message to signify robot waiting;
////            telemetry.addData("Say", "Hello Driver");//
////
////            // Set all motors to use RUN_USING_ENCODERS if encoders are installed.
////            }
//        robot.init(hardwareMap);
//        robot.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        robot.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        /*
//         * Code to run ONCE when the driver hits PLAY
//         */
//
//
//        /*
//         * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
//         */
//
//
//        /*
//         * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
//         */
//
//        //@Override
//        public void loop ()
//
//            switch (state) {
//                // Drive Forward indefinitely
//                case 0:
//                    robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                    robot.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                    initialPosition = robot.leftDrive.getCurrentPosition();
//                    robot.leftDrive.setPower(0.5);
//                    robot.rightDrive.setPower(0.5);
//                    state++;
//                    break;
//                // Stop after set distance
//                case 1:
//                    if ((robot.leftDrive.getCurrentPosition() - initialPosition) > 5000) {
//
//                        if (sensorColor.red() > sensorColor.blue() && sensorColor.red() > 0.99) {
//                            robot.leftDrive.setPower(0);
//                            robot.rightDrive.setPower(0);
//
//                        }
//
//                        robot.leftDrive.setPower(0.0);
//                        robot.rightDrive.setPower(0.0);
//                        state++;
//
//
//                    }
//                    break;
//                // Drive Backward indefinitely
//                case 2:
//                    robot.leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
//                    robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
//                    initialPosition = robot.leftDrive.getCurrentPosition();
//                    robot.leftDrive.setPower(-0.5);
//                    robot.rightDrive.setPower(0.5);
//                    state++;
//                    break;
//                // Stop After Set Distance
//                case 3:
//                    if ((robot.leftDrive.getCurrentPosition() - initialPosition) > 180) {
//                        robot.leftDrive.setPower(0.0);
//                        robot.rightDrive.setPower(0.0);
//                        state++;
//                    }
//                    break;
//                default:
//                    break;
//
//            }
//        }
//
//        /*
//         * Code to run ONCE after the driver hits STOP
//         */
//       // @Override
//        public void stop ()
//        {
//
//        }
//    }
//}
