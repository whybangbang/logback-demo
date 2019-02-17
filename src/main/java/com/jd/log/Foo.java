package com.jd.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {

    Logger logger = LoggerFactory.getLogger(Foo.class);

    public void test(){
        logger.debug("Did it again!");
    }
}
