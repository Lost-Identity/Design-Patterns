package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveCapability;


public class OffRoadVehicle extends Vehicle {

   OffRoadVehicle(){
       super(new SpecialDriveCapability());
   }
}
