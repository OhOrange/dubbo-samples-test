package jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

/**
 * @author huangyongwen
 * @date 2022/1/4
 * @Description
 */
public class CommonLog {
//jdk 自带的 jul 日志
    private static final Logger jul = Logger.getLogger(CommonLog.class.getName());

    //    common-logging 类似于 sl4j ，也是个日志门面，如果你依赖包出现 log4j，会自动寻找 log4j.xml ，否则会使用原生JUL实现
//    如果第三方的jar也依赖了子log4j，也会自动找log4j.xml
    private static final Log log = LogFactory.getLog(CommonLog.class);

    public static void main(String[] args) {
        log.info("commons-logging:info");


        jul.info("java.util.logging,jul");
    }
}