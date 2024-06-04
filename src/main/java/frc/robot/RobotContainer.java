// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.Autos.DefaultAuto;
import frc.robot.Subsystems.Drivetrain;

public class RobotContainer {
  private final CommandXboxController driverController = new CommandXboxController(0);

  //TODO: initialize all subsystems here
  private Drivetrain drivetrain = new Drivetrain();

  public RobotContainer() {
    //TODO: use the drivetrain subsystem and the teleopdrive command to set a default command
  
    //BONUS TODO: create a selector that allows you to quicky change between autos

    configureBindings();
  }

  private void configureBindings() {
    //here is where you bind buttons to commands
    //I.E driverController.a().whenPressed(new ShootCommand());
    /*TODO: bind buttons for:
      intaking, 
      spitting the note,
      pivoting the arm to 2 different setpoints, 
      resetting the pivot encoder,
      shooting,
      */

  }

  public Command getAutonomousCommand() {
    // return Commands.print("No autonomous command configured");
    return new DefaultAuto(drivetrain);
  }

}
