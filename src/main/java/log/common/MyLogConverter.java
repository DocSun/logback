package log.common;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author Johnny
 * @date 2019/12/27 22:50
 */
public class MyLogConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {

        String selfDefStr = event.getMDCPropertyMap().get("selfDef");

        StringBuilder sb = new StringBuilder(256);

        sb.append(selfDefStr == null ? "1234" : selfDefStr);
        System.out.println("=============before============" + sb.toString());
        sb.append("clienteIp:localhost");
        sb.append("|protocol:https");
        System.out.println("=============end============" + sb.toString());
        return sb.toString();
    }
}
