package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy ds){
        this.driveStrategyObj = ds;
    }

    public void drive() {

        driveStrategyObj.drive();
    }
}
