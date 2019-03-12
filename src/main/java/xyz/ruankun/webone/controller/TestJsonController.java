package xyz.ruankun.webone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ruankun.webone.Component.LoginResult;

@RestController
public class TestJsonController {

    @GetMapping("/login")
    public LoginResult helloJson(){
        LoginResult l = new LoginResult();
        l.setCode(1);
        l.setMsg("1121212");
        l.setToken("cascsdsfs");
        return l;
    }
}
