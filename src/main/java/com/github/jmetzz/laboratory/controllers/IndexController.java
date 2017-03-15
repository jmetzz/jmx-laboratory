package com.github.jmetzz.laboratory.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jmetzz.laboratory.helpers.AServiceClass;

/**
 * Created by jean on 10/03/2017.
 */
@Controller
public class IndexController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(){
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is a info message");
        LOGGER.warn("This is a warning message");
        LOGGER.error("This is a error message");
        new AServiceClass().aMethod();
        return "index";
    }
}
