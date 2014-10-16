package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: nathanchen Date: 15/10/2014 Time: 5:21 PM Description:
 */
@Controller
@RequestMapping("/")
public class UserController
{
    @RequestMapping("index")
    public String index()
    {
        return "index";
    }
}
