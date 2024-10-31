package Dz1.impl;

import Dz1.Drive.IDrivable;

public class Car implements IDrivable {
    @Override
    public void drive() {
        System.out.println("drive");
    }
}
