package desktop.dynamicproxy;

public class ITEmployee implements IEmployee {
    private double salary;
    private int id;
    private String name;

    @Override
    public void giveHike(double amount) {
        this.salary += amount;
    }

    @Override
    public void payCut(double amount) {
        this.salary -= amount;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;

    }

}