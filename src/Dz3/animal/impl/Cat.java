package Dz3.animal.impl;

import Dz3.animal.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
