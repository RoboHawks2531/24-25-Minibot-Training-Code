// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  //TODO:link the device IDs to the constants folder
  //I.E new TalonFX(Constants.Drivetrain.leftMotorID)
  private final TalonFX leftMotor = new TalonFX(0);
  private final TalonFX rightMotor = new TalonFX(1);

  /** Creates a new Drivetrain. */
  public Drivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
