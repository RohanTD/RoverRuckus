package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.HashMap;

public class motorsAndStuff {
    LinearOpMode op;
    HashMap<String,DcMotor> motors = new HashMap<>();

    public motorsAndStuff(LinearOpMode op){

        this.op = op;
    }

    public void addMotor(String name){
        try{
            //tries one thing
            motors.put(name,op.hardwareMap.dcMotor.get(name));
        }catch (Exception e){
            //do this if it fails
            op.telemetry.addData("ERROR WHILE ADDING MOTOR",e);
            op.telemetry.update();
        }
    }
    public void terminate(){

    }

    }

