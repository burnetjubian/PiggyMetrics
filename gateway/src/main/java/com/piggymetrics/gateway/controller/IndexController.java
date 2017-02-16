package com.piggymetrics.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * CopyRright (c) 2016 IBM
 * Project:
 *
 * @Comments
 * @Author Zhong Han
 * @Created Date 2017/2/15
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index2")
    public ModelAndView index2(){
        return new ModelAndView("index");
    }

}
