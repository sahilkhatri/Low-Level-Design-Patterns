package StrategyPattern;

import StrategyPattern.Strategy.OffroadDriveStrategy;

public class OffroadVehicle extends VehicleDesign {
    OffroadVehicle(){
        super(new OffroadDriveStrategy());
    }
}