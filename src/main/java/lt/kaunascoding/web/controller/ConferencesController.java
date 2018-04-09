package lt.kaunascoding.web.controller;


import com.mysql.jdbc.StringUtils;
import lt.kaunascoding.web.model.Duombaze;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConferencesController {
    @GetMapping("/conferences")
    String atsakymas(Model model) {
        Duombaze db = new Duombaze();
        model.addAttribute("list", db.getAllConferencesUsers());
        return "conferences";
    }

    @PostMapping("/conferences")
    String atsakymas(
            @RequestParam(value = "conf1", required = false) String conf1,
            Model model) {

        Duombaze db = new Duombaze();

        if (!StringUtils.isNullOrEmpty(conf1)
                ) {
            db.insertDalyvis(conf1);
        }
        model.addAttribute("list", db.getAllConferencesUsers());
        return "conferences";
    }




}
