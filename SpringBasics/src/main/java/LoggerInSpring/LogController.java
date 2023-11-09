package LoggerInSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogController {

    // creating a logger
    Logger logger
            = LoggerFactory.getLogger(LogController.class);

    public String log()
    {
        // Logging various log level messages
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");

        return "Whatever writing in block i ll get back to you in logs";
    }
    public String toString(){
        logger.trace("Trace Record");
        logger.info("Information of selected opeartions");
        logger.debug("Debugging Opeartions History");
        logger.error("Error Logs with specific File name having fully qualified name ");

        return "This information of logs return method";
    }
}
