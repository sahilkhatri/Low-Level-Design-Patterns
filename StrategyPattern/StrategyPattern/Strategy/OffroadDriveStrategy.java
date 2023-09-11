package StrategyPattern.Strategy;

import StrategyPattern.DriveStrategy;

public class OffroadDriveStrategy implements DriveStrategy {
    public void drive(){
        System.out.println("Off-road Capability Vehicles.Vehicle: THAR");
        return;
    }
}
