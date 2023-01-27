/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package desktop;

import java.lang.reflect.InvocationTargetException;

import desktop.reflection.ReflectionHandler;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException,
            ClassNotFoundException {
        var handler = new ReflectionHandler();
        handler.triggerReflectionStuff();
    }
}
