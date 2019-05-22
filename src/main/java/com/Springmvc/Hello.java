package com.Springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/5/21.
 */
@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping(method = RequestMethod.GET)
    public String getMap(ModelMap map){
        map.addAttribute("message","hello");
        return "hello";
    }
}
