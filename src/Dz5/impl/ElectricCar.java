package Dz5.impl;

import Dz5.Appliance;
import Dz5.IRechargeable;

public class ElectricCar extends Appliance implements IRechargeable {
    @Override
    public void turnOff() {
        System.out.println("OFF car");
    }

    @Override
    public void recharge() {
        System.out.println("recharge car");
    }
}
