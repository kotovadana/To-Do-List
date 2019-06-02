package kotova.sda.controllers;


import kotova.sda.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping ("/test")
    private String test(){
        return "todo_list";
    }

    @RequestMapping ("/PersonalToDoList")
    private String meow() {
        return "firstpage_form";
    }

    @GetMapping("/PersonalToDoList/List")
    private String list() {
        return "todo_list";
    }
    @GetMapping("/PersonalToDoList/Registration")
    private String registrate() {
        return "registration_form";
    }

    //@PostMapping("/PersonalToDoList/Registration")
    //private String saveUser (User user){ }

    @GetMapping("/PersonalToDoList/Registration/Successful_reg")
    private String successreg() {
        return "successreg_form";
    }

}
