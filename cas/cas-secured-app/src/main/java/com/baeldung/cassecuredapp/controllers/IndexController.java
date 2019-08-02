package com.baeldung.cassecuredapp.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    private Logger log = LogManager.getLogger(getClass());

    @GetMapping("/")
    public String index() {
        log.info("index");
        return "index";
    }
}
