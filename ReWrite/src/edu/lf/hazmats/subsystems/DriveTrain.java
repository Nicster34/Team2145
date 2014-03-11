/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lf.hazmats.subsystems;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.lf.hazmats.RobotMap;
import edu.lf.hazmats.commands.DriveWithController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Owner
 */
public class DriveTrain extends Subsystem{
    RobotDrive drive = new RobotDrive(1,2);
     public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithController());
     }
    
    public void roboDrive(double throttle, double twist) {
        drive.arcadeDrive(throttle, twist);
    }
    
}

