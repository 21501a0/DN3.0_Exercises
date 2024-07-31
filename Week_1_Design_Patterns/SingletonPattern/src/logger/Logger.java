package logger;

public class Logger {
    private static Logger loginst;

    private Logger(){}

    public static Logger getInstance(){
        if(loginst == null){
            loginst = new Logger();
        }
        return loginst;
    }
    public void getName(String instancemessage){
        System.out.println("Message :"+instancemessage);
    }
}