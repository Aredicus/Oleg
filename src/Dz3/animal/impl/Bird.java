package Dz3.animal.impl;

import Dz3.animal.IAnimal;

public class Bird implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Tweet");
    }
}
