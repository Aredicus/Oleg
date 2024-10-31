package Dz6;

public abstract class Person {
    protected final int age;
    protected final String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("создана персона с именем " + name + " и возрастом " + age);
    }
}
