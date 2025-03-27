package ChainOfResponsibilityDesignPattern;

public class InfoLoggerProcessor extends LoggerProcessor  {


    public InfoLoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void  logInfo(int level, String message) {
        if (level == INFO) {
            System.out.println("INFO: " + message);
        } else {
            nextLoggerProcessor.logInfo(level, message);
        }
    }
}
