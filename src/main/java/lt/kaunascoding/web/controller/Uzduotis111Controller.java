package lt.kaunascoding.web.controller;


import lt.kaunascoding.web.model.Duombaze;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Uzduotis111Controller {

    @RequestMapping("/uzduotis111")
    String atsakymas(Model model) {
        Duombaze db = new Duombaze();
        model.addAttribute("count", db.getAllUzduotis111());

        return "/uzduotis111";
    }
}
