package desktop.reflection;

public class Person {
    protected String name;
    int age;

    public Person() {
        System.out.println("Created new Person");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("New person with the name: " + this.name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("New person with the name " + this.name + " and the age " + this.age);
    }

    void hello() {
        System.out.println("Wonderful");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }

    int add(int x, int y) {
        return x + y;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + "'\'" + ", age=" + age + '}';
    }
}
