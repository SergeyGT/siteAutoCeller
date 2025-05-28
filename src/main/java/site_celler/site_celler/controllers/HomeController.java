package site_celler.site_celler.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String HomePage() {
        return "pages/home";
    }

    @GetMapping("/catalog")
    public String CatalogPage() {
        return "pages/catalog";
    }
    
    
}
