
package com.kaydub.mediacache.web.controller;


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
    public ModelAndView index(Model model)
    {
        ModelAndView modelAndview = new ModelAndView("index");
        return modelAndview;
    }
    
    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
        @RequestMapping("/failed")
    public ModelAndView failed() {
        return new ModelAndView("music/songs");
    }
}
