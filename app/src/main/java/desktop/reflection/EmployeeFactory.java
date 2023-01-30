package desktop.reflection;

public class EmployeeFactory {
    public Employee createEmployee(String title, String name, int age) {
        switch (title) {
            case "Manager":
                return new Manager(name, age);
            case "Slave":
                return new Slave(name, age);
            default:
                throw new IllegalArgumentException();
        }
    }
}
