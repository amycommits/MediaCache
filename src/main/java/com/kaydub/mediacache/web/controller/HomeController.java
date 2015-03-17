
package com.kaydub.mediacache.web.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kevin W.
 */
@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index(Model model)
    {
        //ModelAndView modelAndview = new ModelAndView("index");
        //return modelAndview;
        return "index";
    }
    
    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    
}
