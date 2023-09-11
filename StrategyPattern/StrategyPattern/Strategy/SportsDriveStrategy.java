package StrategyPattern.Strategy;

import StrategyPattern.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SPORTS Capability Vehicles.Vehicle: MUSTANG GT");
        return;
    }
}
