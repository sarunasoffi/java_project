package lt.kaunascoding.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaujienosController {
    @RequestMapping("/naujienos")
    String atsakymas(Model model) {
        return "naujienos";
    }
}
