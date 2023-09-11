package StrategyPattern.Strategy;

import StrategyPattern.DriveStrategy;

public class XyzDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This way you can implement any drive strategy without code duplicate.");
        return;
    }
}
