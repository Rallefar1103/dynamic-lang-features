package desktop.lambda;

public class Demo {
    public static void main(String[] args) {
        // We can do this because IAbstract is a functional interface and thus the
        // compiler
        // knows exactly what method we are referring to because there is only one
        IAbstract obj = () -> System.out.println("Show me!!!");

        obj.showMe();
    }
}
