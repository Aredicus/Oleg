package Dz2.impl;

import Dz2.pay.IPayable;
import Dz2.work.IWorkable;

public class Freelancer implements IWorkable, IPayable {
    @Override
    public void getPaid() {
        System.out.println("Олег");
    }

    @Override
    public void work() {
        System.out.println("ОЛЕГ");
    }
}
