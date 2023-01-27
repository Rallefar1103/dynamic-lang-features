package desktop.reflection;

public class Employee extends Person {

    @Override
    void greet(String name) {
        System.out.println("Hey my name is " + this.name + " I am an employee");
    }

}
