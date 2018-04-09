package lt.kaunascoding.web.controller;


import com.mysql.jdbc.StringUtils;
import lt.kaunascoding.web.model.Duombaze;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @GetMapping("/admin")
    String noVariables(Model model){
        return "admin";
    }

    @PostMapping("/admin")
    String atsakymas(
            @RequestParam(value = "inputUserName", required = false) String inputUserName,
            @RequestParam(value = "inputName", required = false) String inputName,
            @RequestParam(value = "inputSurname", required = false) String inputSurname,
            @RequestParam(value = "inputBranch", required = false) String inputBranch,
            @RequestParam(value = "inputPosition", required = false) String inputPosition,
            @RequestParam(value = "inputHireDate", required = false) String inputHireDate,
            @RequestParam(value = "inputTerminateDate", required = false) String inputTerminateDate,
            @RequestParam(value = "inputSalary", required = false) String inputSalary,
            @RequestParam(value = "inputPassword", required = false) String inputPassword,
                    Model model) {

        Duombaze db = new Duombaze();

        if (!StringUtils.isNullOrEmpty(inputUserName)
                && !StringUtils.isNullOrEmpty(inputName)
                && !StringUtils.isNullOrEmpty(inputSurname)
                && !StringUtils.isNullOrEmpty(inputBranch)
                && !StringUtils.isNullOrEmpty(inputPosition)
                && !StringUtils.isNullOrEmpty(inputHireDate)
                && !StringUtils.isNullOrEmpty(inputTerminateDate)
                && !StringUtils.isNullOrEmpty(inputSalary)
                && !StringUtils.isNullOrEmpty(inputPassword)
                ) {
            db.insertEmployee(inputUserName, inputName,inputSurname, inputBranch, inputPosition, inputHireDate, inputTerminateDate, inputSalary, inputPassword);
        }


        return "admin";
    }
}
