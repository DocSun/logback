package log.common;

import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.MDC;

/**
 * @author Johnny
 * @date 2019/12/28 1:35
 */
public class MyAsyncAppender extends AsyncAppender {

    @Override
    protected void preprocess(ILoggingEvent eventObject) {
        MDC.put("selfDef",buildSelfDef());
        super.preprocess(eventObject);
    }

    private String buildSelfDef(){
        StringBuilder sb = new StringBuilder(128);
        sb.append("test1|test2|test3");
        return sb.toString();
    }
}
