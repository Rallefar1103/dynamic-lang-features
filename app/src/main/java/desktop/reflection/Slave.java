package desktop.reflection;

public class Slave implements Employee {
    String name;
    int age;

    public Slave(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void greet(String something) {
        System.out.println(
                "Hello, name is " + this.name + " and I am " + this.age + " old - I am working as a Slave");

    }

}
