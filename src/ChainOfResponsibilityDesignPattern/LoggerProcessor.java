package ChainOfResponsibilityDesignPattern;

public class LoggerProcessor {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public LoggerProcessor nextLoggerProcessor;


    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void logInfo(int level, String message) {
        nextLoggerProcessor.logInfo(level, message);
    }

}
