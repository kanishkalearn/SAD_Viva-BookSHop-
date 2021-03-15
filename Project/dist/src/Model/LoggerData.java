
package Model;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;


public class LoggerData {

    public static void initLogger() {
        try {
            String path = "LoggerData/loggerdata.txt";
            PatternLayout layout = new PatternLayout("%-3p %-10d %m %L %c %n");
            RollingFileAppender appender = new RollingFileAppender(layout, path);
            appender.setName(" loggerdata");
            appender.setMaxFileSize("1MB");
            appender.activateOptions();
            Logger.getRootLogger().addAppender(appender);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
