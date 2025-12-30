public class LogLevels {
    
    public static String message(String logLine) {
        int colon = logLine.indexOf(":");
        return logLine.substring(colon + 1).trim();
    }

    public static String logLevel(String logLine) {
        int bracketEndIndex = logLine.indexOf("]");
        return  logLine.substring(1, bracketEndIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";
    }
}

