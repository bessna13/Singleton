import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;

    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");


    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }


    public void log(String msg) {
        System.out.println("[" + num++ + "] " + formatForDateNow.format(dateNow) + " " + msg);
    }
}