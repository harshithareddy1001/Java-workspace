package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyWebController {
    @RequestMapping("/home")
    public String home() {
        return "Home.html";//This will render homepage
    }
        @RequestMapping("/about")
        public String about(){
            return "aboutus.html";
    }
    @RequestMapping("/cricket")
    public String cricket(){
        return "cricket.html";
    }

}
