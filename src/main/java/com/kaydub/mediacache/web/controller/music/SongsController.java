
package com.kaydub.mediacache.web.controller.music;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kevin W.
 */
@Controller
public class SongsController {

    @RequestMapping("/songs")
    public ModelAndView getSongs(Model model) {
        return new ModelAndView("music/songs");
    }
}
