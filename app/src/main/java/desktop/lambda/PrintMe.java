package desktop.lambda;

public class PrintMe implements IPrintable {

    @Override
    public String print(String printThis) {
        return "Meow motherfuckers: " + printThis;

    }

}
