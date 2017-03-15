package com.github.jmetzz.laboratory.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jean on 10/03/2017.
 */
public class AServiceClass {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public void aMethod(){
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is a info message");
        LOGGER.warn("This is a warning message");
        LOGGER.error("This is a error message");
    }

}
