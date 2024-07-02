package WithStrategyPattern;


import WithStrategyPattern.Strategy.XyzDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new XyzDriveStrategy());
    }
}
