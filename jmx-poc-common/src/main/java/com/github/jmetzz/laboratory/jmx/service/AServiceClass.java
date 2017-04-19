package com.github.jmetzz.laboratory.jmx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jean on 10/03/2017.
 */
@Service
public class AServiceClass {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Value("${service.property:default-value}")
    private String property;


    public void aMethod(){
        LOGGER.debug("This is a debug message. Property is {}", property);
        LOGGER.info("This is a info message. Property is {}", property);
        LOGGER.warn("This is a warning message. Property is {}", property);
        LOGGER.error("This is a error message. Property is {}", property);
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
