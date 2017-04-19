package com.github.jmetzz.laboratory.jmx.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.jmetzz.laboratory.jmx.service.AServiceClass;


/**
 * Created by jean on 10/03/2017.
 */
@RestController
public class IndexController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AServiceClass aService;

    @RequestMapping("/")
    public String index(){
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is a info message");
        LOGGER.warn("This is a warning message");
        LOGGER.error("This is a error message");

        aService.aMethod();

        return "index";
    }
}
