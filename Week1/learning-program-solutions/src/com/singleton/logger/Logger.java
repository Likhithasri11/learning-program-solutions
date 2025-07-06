package com.singleton.logger;

public class Logger {

    // Step 1: private static instance of the same class
    private static Logger instance;

    // Step 2: private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging method for demonstration
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
