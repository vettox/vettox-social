package com.vettox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * The class HomeController.
 * <p/>
 * User: Vitaliy
 * Date: 07.07.13
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String homePage(Map<String, Object> model) {
        model.put("helloString", "HomeController");
        return "index";
    }
}
