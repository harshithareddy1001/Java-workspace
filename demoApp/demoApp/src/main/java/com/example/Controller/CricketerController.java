package com.example.Controller;

import com.example.Model.cricket_lombok;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/cricket")
public class CricketerController {
    @RequestMapping("/show")
    public String home() {
        return "cricketers.html";//This will render homepage
    }

    @RequestMapping("/showCric")
    public ModelAndView showCricketer() {
        ModelAndView mv = new ModelAndView("cricketers");

        String name = "uppu";
        Date dt = new Date();
        cricket_lombok c=new cricket_lombok(101,11,"India");
        mv.addObject("myname", name);
        mv.addObject("mydate", dt);
        mv.addObject("mycricket",c);
        return mv;
    }

}
