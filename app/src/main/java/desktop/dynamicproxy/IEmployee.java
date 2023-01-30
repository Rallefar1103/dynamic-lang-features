package desktop.dynamicproxy;

public interface IEmployee {
    void giveHike(double amount);

    void payCut(double amount);

    int getId();

    String getName();

    double getSalary();

    void setId(int id);

    void setName(String name);

    void setSalary(double salary);
}
