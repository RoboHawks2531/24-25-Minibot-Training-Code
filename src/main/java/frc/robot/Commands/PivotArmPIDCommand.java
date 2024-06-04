// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.ArmPivot;

public class PivotArmPIDCommand extends Command {
  
private ArmPivot m_ArmPivot;
private double m_setpoint;

private PIDController m_PidController = new PIDController(0, 0, 0);


  /** Creates a new PivotArmCommand. */
  public PivotArmPIDCommand(ArmPivot armPivot, double setpoint) {
    this.m_ArmPivot = armPivot;
    this.m_setpoint = setpoint;
    addRequirements(m_ArmPivot);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = m_PidController.calculate(m_ArmPivot.getPivotEnocder(), m_setpoint);

    m_ArmPivot.setPivotVolts(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_ArmPivot.setPivotVolts(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
