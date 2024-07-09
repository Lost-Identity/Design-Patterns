//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Exception Occurs");
        logProcessor.log(LogProcessor.DEBUG, "Need to debug this");
        logProcessor.log(LogProcessor.INFO, "Just for info");

    }
}