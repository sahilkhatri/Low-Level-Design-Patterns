package StrategyPattern.Strategy;

import StrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("VehicleStandards.Normal Capability: WagonR");
        return;
    }
}
