package kotova.sda.controllers;


import kotova.sda.service.UserService;
import kotova.sda.entity.User;
import kotova.sda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    private UserRepository userRepository;

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
    private String registrate(User user) {
        return "registration_form";
    }

    @PostMapping("/PersonalToDoList/Registration")
    private String saveUser (User user){
        userService.save(user);
        return "redirect:/PersonalToDoList/Registration/Successful_reg";
    }

    @GetMapping("/PersonalToDoList/Registration/Successful_reg")
    private String successreg() {
        return "successreg_form";
    }

    @GetMapping("/PersonalToDoList/Users")
    private String allUsers (Model model) {
        model.addAttribute("users", this.userService.getAllUsers());
        return "user_list";
    }
}
