package lt.kaunascoding.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConferencesController {

    @RequestMapping("/conferences")
    String atsakymas(Model model) {
        return "conferences";
    }
}
