package site_celler.site_celler.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String HomePage() {
        return "pages/home";
    }
    
}
