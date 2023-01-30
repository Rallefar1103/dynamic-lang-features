package desktop.reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectionHandler {
    public void triggerReflectionStuff() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        var classObj = Class.forName("desktop.reflection.Manager");

        var greetMethod = classObj.getMethod("greet", String.class);
        var managerConstructor = classObj.getConstructor(String.class, int.class);
        var managerObj = managerConstructor.newInstance("Bjarne", 45);
        greetMethod.invoke(managerObj, "Hallo");
    }
}
