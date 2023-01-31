package desktop.lambda;

public class Lambdas {
    public static void main(String[] args) {
        IPrintable printable = new PrintMe();
        IPrintable lamdaPrinter = (s) -> s;

        var result = printSomething(lamdaPrinter);
        System.out.println(result);
    }

    static String printSomething(IPrintable printableThing) {
        return printableThing.print("Yup");
    }
}
