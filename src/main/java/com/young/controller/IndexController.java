package com.young.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author:Young
 * Date:2020/7/31-9:53
 */
@Controller
public class IndexController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }
}
