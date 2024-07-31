package logger;

public class SingletonPattern {
    public static void main(String[] args) {
        Logger logg1 = Logger.getInstance();
        Logger logg2 = Logger.getInstance();

        logg1.getName("This is the first log message Instance.");
        logg2.getName("This is the second log messag Instance.");

        if (logg1 == logg2) {
            System.out.println("Both refernces are the same instance.");
        } else {
            System.out.println("logg1 and logg2 are different instances.");
        }
    }
}