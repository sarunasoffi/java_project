package lt.kaunascoding.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @RequestMapping("/")
    String lala(Model model) {
        model.addAttribute("labas", "Veikiu!!!!");

        ArrayList<String> sarasas =   new ArrayList<>();

        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");
        sarasas.add("AAA");

        model.addAttribute("list", sarasas);

        return "lala";
    }

}
