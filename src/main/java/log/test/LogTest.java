package log.test;

import log.common.LogUtil;
import org.slf4j.Logger;

/**
 * @author Johnny
 * @date 2019/12/27 23:29
 * 自定义appender：https://www.jianshu.com/p/a0eb78b8c775
 * 异步化实现原理：https://jingyan.baidu.com/article/72ee561af185f3a16038df16.html
 */
public class LogTest {

    private static Logger appLogger = LogUtil.appLogger;


    public static void main(String[] args) {
        appLogger.warn("ZNTEST");

    }
}
