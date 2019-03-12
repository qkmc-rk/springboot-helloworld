package xyz.ruankun.webone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestTemplateController {

    @RequestMapping("/test")
    public String test(java.util.Map<String,String> map){
//        name = "niejiao";
        map.put("user","ruankun");
        return "test";
    }
}
