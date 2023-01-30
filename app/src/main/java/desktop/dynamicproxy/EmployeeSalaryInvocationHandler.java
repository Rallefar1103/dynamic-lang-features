package desktop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

    // target
    private IEmployee employeeTarget;

    public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {
        this.employeeTarget = employeeTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("giveHike")) {
            // Preprocessing code goes here
            double hikeValue = (double) args[0];

            if (hikeValue <= 0.0) {
                throw new RuntimeException("Hike value must be greater than zero");
            }
        }

        // Action call to my service layer through the method called from the client
        Object returnResult = method.invoke(this.employeeTarget, args);

        // Postprocessing code goes here
        return returnResult;
    }

}
