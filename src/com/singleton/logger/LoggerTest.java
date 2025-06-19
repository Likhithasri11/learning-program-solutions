package com.singleton.logger;

public class LoggerTest {
    public static void main(String[] args) {
        // Get logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        // Try to get another logger instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Verify if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton confirmed).");
        } else {
            System.out.println("Logger instances are different (Singleton failed).");
        }
    }
}
