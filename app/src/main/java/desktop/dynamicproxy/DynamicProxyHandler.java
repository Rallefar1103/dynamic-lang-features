package desktop.dynamicproxy;

public class DynamicProxyHandler {
    public static void main(String[] args) {
        try {
            Class<?> StudentClassInfo = Class.forName("desktop.dynamicproxy.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
