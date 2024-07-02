package WithStrategyPattern;


import WithStrategyPattern.Strategy.SpecialDriveCapability;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SpecialDriveCapability());
    }
}
