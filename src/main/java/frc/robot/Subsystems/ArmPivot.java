// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.hal.ConstantsJNI;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmPivot extends SubsystemBase {
  //TODO: Make a motor object for the arm pivot motor
private final TalonFX armpivotmotor = new TalonFX(Constants.ArmConstants.armpivotmotor);

  /** Creates a new ArmPivot. */
  public ArmPivot() {

  }

  //TODO: Create a method that takes in a double power(Volts) and sets the arm pivot motor to that power
public void setPivotVolts(double volts) {
  armpivotmotor.setVoltage(volts);
}
  //TODO: Create a method that returns a double for the current power of the arm pivot motor

  //TODO: Create a method that returns the value of the pivot motor encoder
public double getPivotEnocder() {
  return armpivotmotor.getPosition().getValueAsDouble();
}
  //TODO: Create a method that resets the pivot motor encoder
public void ZeroEncoder() {
  armpivotmotor.setPosition(0);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Enoder Value", getPivotEnocder());
  }
}
