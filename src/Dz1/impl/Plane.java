package Dz1.impl;

import Dz1.Drive.IDrivable;
import Dz1.Fly.IFlyable;

public class Plane implements IDrivable, IFlyable
{
    @Override
    public void drive() {
        System.out.println("Wroooom");
    }

    @Override
    public void fly() {
        System.out.println("WJUH");
    }
}
