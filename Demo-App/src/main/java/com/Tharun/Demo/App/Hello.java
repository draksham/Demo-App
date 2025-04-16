package com.Tharun.Demo.App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/Hello")
    public String greet(){
        return "Hello world, My nane is Tharun i am learning spring" ;
    }
}
