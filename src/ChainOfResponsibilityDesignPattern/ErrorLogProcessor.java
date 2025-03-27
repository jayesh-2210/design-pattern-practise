package ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LoggerProcessor  {
    public ErrorLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void  logInfo(int level, String message) {
        if (level == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            nextLoggerProcessor.logInfo(level, message);
        }
    }
}
