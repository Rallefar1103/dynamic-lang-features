package desktop.reflection;

public abstract class Person {
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

    abstract void greet(String name);

    @Override
    public String toString() {
        return "Person{" + "name=" + name + "'\'" + ", age=" + age + '}';
    }
}
