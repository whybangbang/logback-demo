package com.jd.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
    final static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {

        logger.info("Entering application.");

        Foo foo = new Foo();
        foo.test();
        logger.info("Exiting application.");
    }
}
