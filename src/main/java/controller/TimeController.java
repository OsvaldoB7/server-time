package controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class TimeController {

    @GetMapping("/time")
    public String getTime(Model model) {
        Date date = new Date();
        model.addAttribute("time", date);
        return "time";
    }

}
