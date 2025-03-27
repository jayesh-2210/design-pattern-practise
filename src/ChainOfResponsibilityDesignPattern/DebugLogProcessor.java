package ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LoggerProcessor  {


    public DebugLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void  logInfo(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            nextLoggerProcessor.logInfo(level, message);
        }
    }
}
