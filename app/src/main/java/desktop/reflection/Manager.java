package desktop.reflection;

public class Manager implements Employee {
    String name;
    int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void greet(String something) {
        System.out.println("Hello, name is " + this.name + " and I am " + this.age + " I work as a Manager");

    }

}
