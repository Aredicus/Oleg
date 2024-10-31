package Dz3.animal.impl;

import Dz3.animal.IAnimal;

public class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("woof");
    }
}
