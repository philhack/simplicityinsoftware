package com.simplicityitself.core.commands

import com.simplicityitself.Drone

abstract class BaseCommand implements Command {

  protected final Drone drone

  BaseCommand(Drone drone) {
    this.drone = drone
  }

  def abstract logEntry

  protected abstract action()

  @Override
  Map Execute() {
    action()
    drone.currentStatus
  }
}
