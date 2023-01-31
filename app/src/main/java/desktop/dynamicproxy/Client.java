package desktop.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ITEmployee itEmployee = new ITEmployee();
        itEmployee.setId(0);
        itEmployee.setName("Bjarne");
        itEmployee.setSalary(1000);

        // In case you want to implement some guidelines for who can hand out hikes or
        // cuts you can create a proxy who will take care of the logic before reaching
        // the actual object and performing the actions.

        // we instantiate the invocation handler and passes in the actual Employee
        // object
        EmployeeSalaryInvocationHandler empSalHandler = new EmployeeSalaryInvocationHandler(itEmployee);
        IEmployee employee = (IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
                new Class[] { IEmployee.class }, empSalHandler);
        employee.giveHike(500);

        System.out.println(employee.getSalary());
    }

    

}
