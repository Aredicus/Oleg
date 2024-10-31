package Dz6.impl;

import Dz6.IEmployee;
import Dz6.Person;

public class Developer extends Person implements IEmployee {
    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSalary() {
        System.out.println("Я простой работник " + name);
    }

    @Override
    public void work() {
        System.out.println("Работаю до " + (age + 1));
    }
}
