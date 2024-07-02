package WithStrategyPattern.Strategy;

public class XyzDriveStrategy implements DriveStrategy{

    // xyz drive capability
    @Override
    public void drive() {
        System.out.println("xyz drive capability");
    }
}
