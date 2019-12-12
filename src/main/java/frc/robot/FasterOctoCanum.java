/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SerialPort.Port;
/**
 * Add your docs here.
 */
public class FasterOctoCanum extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private RobotDrive m_drive;
  private AHRS m_gyro; 
  private WPI_TalonSRX m_frontLeft; 
  private WPI_TalonSRX m_frontRight; 
  private WPI_TalonSRX m_backLeft; 
  private WPI_TalonSRX m_backRight; 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public FasterOctoCanum()
  {
    m_frontLeft = new WPI_TalonSRX(1);
    m_frontRight = new WPI_TalonSRX(2);
    m_backLeft = new WPI_TalonSRX(3); 
    m_backRight = new WPI_TalonSRX(4); 
    m_gyro = new AHRS(Port.kMXP);
    m_drive = new RobotDrive(m_frontLeft, m_backLeft, m_frontRight, m_backRight);
  }
  public void drive()
  {
    m_drive.mecanumDrive_Cartesian(x, y, rotation, gyroAngle);
  }
}
