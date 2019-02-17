package com.jd.log;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 重新设置配置
 */
public class MyApp3 {
    final static Logger logger = LoggerFactory.getLogger(MyApp3.class);

    public static void main(String[] args) {
        // TODO 一个logger的上下文
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

        try {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);
            // Call context.reset() to clear any previous configuration, e.g. default
            // configuration. For multi-step configuration, omit calling context.reset().

            String filePath = "/Users/why/repo2/logbackdemo/src/main/resources/logback.xml";
            context.reset();
            configurator.doConfigure(filePath);
        } catch (JoranException je) {
            // StatusPrinter will handle this
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(context);

        logger.info("Entering application.");

        Foo foo = new Foo();
        foo.test();
        logger.info("Exiting application.");
    }
}
