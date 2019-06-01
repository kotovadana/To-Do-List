package kotova.sda.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping ("/")
    @ResponseBody
    String meow() {
        return "RAWR";
    }
}