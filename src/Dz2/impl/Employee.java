package Dz2.impl;

import Dz2.pay.IPayable;
import Dz2.work.IWorkable;

public class Employee implements IPayable, IWorkable {
    @Override
    public void getPaid() {
        System.out.println("Покупаю что-то");
    }

    @Override
    public void work() {
        System.out.println("Работаю");
    }
}
