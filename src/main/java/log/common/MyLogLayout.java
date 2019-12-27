package log.common;

import ch.qos.logback.classic.PatternLayout;

/**
 * @author Johnny
 * @date 2019/12/28 0:33
 */
public class MyLogLayout extends PatternLayout {

    public MyLogLayout(){
        super();
        this.getDefaultConverterMap().put("selfDef", MyLogConverter.class.getName());
    }
}
