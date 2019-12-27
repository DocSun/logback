package log.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnny
 * @date 2019/12/27 22:49
 */
public class LogUtil {


    public static Logger consoleLogger = LoggerFactory.getLogger("console");

    public static Logger appLogger = LoggerFactory.getLogger("CodeStudy");

    public static Logger defaultLogger = LoggerFactory.getLogger(LogUtil.class);
}
