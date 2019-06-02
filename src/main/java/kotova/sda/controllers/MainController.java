package kotova.sda.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping ("/PersonalToDoList")
    String meow() {
        return "firstpage_form";
    }

    //@RequestMapping ("/PersonalToDoList/Registration")
    //String gav() {return "registration_form";}

    @GetMapping("/PersonalToDoList/List")
    private String list() {
        return "todo_list";
    }

    @GetMapping("/PersonalToDoList/Registration")
    private String registrate() {
        return "registration_form";
    }
    @GetMapping("/PersonalToDoList/Registration/Successful_reg")
    private String successreg() {
        return "successreg_form";
    }

}
