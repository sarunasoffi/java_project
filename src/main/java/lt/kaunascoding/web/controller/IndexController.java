package lt.kaunascoding.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping("/")
    String lala(Model model) {

        return "lala";
    }

}
