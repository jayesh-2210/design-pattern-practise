package ChainOfResponsibilityDesignPattern;

public class MainClass {

    public static void main(String[] args) {
        LoggerProcessor loggerProcessor = new InfoLoggerProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        loggerProcessor.logInfo(2, "This is a debug log");
        loggerProcessor.logInfo(3, "This is an error log");
        loggerProcessor.logInfo(1, "This is an info log");
    }

}
