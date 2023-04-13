package edu.kis.powp.command.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y, Job2dDriver driver){
        this.x = x;
        this.y = y;
        this.job2dDriver = driver;
    }

    public void setJob2dDriver(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x,y);
    }
}
