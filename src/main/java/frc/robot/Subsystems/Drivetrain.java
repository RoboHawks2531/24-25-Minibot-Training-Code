// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.math.estimator.PoseEstimator;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  //TODO:link the device IDs to the constants folder
  //I.E new TalonFX(Constants.Drivetrain.leftMotorID)
  private final TalonFX leftMotor = new TalonFX(0);
  private final TalonFX rightMotor = new TalonFX(0);

  private final DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  /** Creates a new Drivetrain. */
  public Drivetrain() {
      //TODO: Set both motors to brake by default


      //TODO: Now set the left motor to be inverted, and the right motor to not be inverted

  }

  public void setSplitMotorVolts(double leftVolts, double rightVolts) {
      leftMotor.setVoltage(leftVolts);
      rightMotor.setVoltage(rightVolts);
  }

  public void arcadeDrive(double speedX, double rot) {
      drive.arcadeDrive(speedX, rot);
  }

  //TODO: Create a tankDrive method that takes in two doubles, leftSpeed and rightSpeed
  public void tankDrive() {
      //how would we call the tank drive method from the DifferentialDrive class?
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
