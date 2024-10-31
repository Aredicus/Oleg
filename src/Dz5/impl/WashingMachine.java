package Dz5.impl;

import Dz5.Appliance;
import Dz5.IRechargeable;

public class WashingMachine extends Appliance implements IRechargeable {
    @Override
    public void turnOff() {
        System.out.println("Off Machine");
    }

    @Override
    public void recharge() {
        System.out.println("Recharge machine");
    }
}
