import Dz1.impl.Car;
import Dz1.impl.Plane;
import Dz2.impl.Employee;
import Dz2.impl.Freelancer;
import Dz3.animal.IAnimal;
import Dz3.animal.impl.Bird;
import Dz3.animal.impl.Cat;
import Dz3.animal.impl.Dog;
import Dz4.move.impl.Vehicle;
import Dz5.impl.ElectricCar;
import Dz5.impl.WashingMachine;
import Dz6.impl.Developer;
import Dz7.impl.BMW;
import Dz7.impl.Tesla;

public class Main {
    public static void main(String[] args) {
        dz1();
        dz2();
        dz3();
        dz4();
        dz5();
        dz6();
        dz7();
    }

    private static void dz1() {
        System.out.println();
        System.out.println("DZ1");
        Car car = new Car();
        Plane plane = new Plane();
        car.drive();
        plane.fly();
        plane.drive();
    }

    private static void dz2() {
        System.out.println();
        System.out.println("DZ2");
        Employee employee = new Employee();
        Freelancer freelancer = new Freelancer();
        employee.work();
        employee.getPaid();
        freelancer.work();
        freelancer.getPaid();
    }

    private static void dz3() {
        System.out.println();
        System.out.println("DZ3");
        IAnimal[] animals = new IAnimal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Bird();
        for (IAnimal animal : animals) {
            animal.speak();
        }
    }

    private static void dz4() {
        System.out.println();
        System.out.println("DZ4");
        Vehicle vehicle = new Vehicle();
        Dz4.move.impl.Car car = new Dz4.move.impl.Car();
        vehicle.move();
        car.move();
        car.drive();
    }

    private static void dz5() {
        System.out.println();
        System.out.println("DZ5");
        WashingMachine washingMachine = new WashingMachine();
        ElectricCar electricCar = new ElectricCar();
        washingMachine.turnOn();
        washingMachine.recharge();
        washingMachine.turnOff();
        electricCar.turnOn();
        electricCar.recharge();
        electricCar.turnOff();
    }

    private static void dz6() {
        System.out.println();
        System.out.println("DZ6");
        Developer developer = new Developer("Олег", 26);
        developer.getSalary();
        developer.work();
    }

    private static void dz7() {
        System.out.println();
        System.out.println("DZ7");
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        bmw.displayInfo();
        tesla.displayInfo();
    }
}
