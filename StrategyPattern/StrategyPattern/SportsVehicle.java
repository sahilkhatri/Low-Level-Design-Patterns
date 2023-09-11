package StrategyPattern;

import StrategyPattern.Strategy.SportsDriveStrategy;

class SportsVehicle extends VehicleDesign {
    SportsVehicle(){
        super (new SportsDriveStrategy());
    }
}