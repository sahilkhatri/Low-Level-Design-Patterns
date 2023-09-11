package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends VehicleDesign{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
