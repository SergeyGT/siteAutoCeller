package site_celler.site_celler.controllers;


import site_celler.dto.MailRequestDTO;

import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.*;




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

    @GetMapping
    public String MainPage(Model model){
        model.addAttribute("mailRequest", new MailRequestDTO());
        return "pages/index";
    }
    
    @PostMapping("/main/mail")
    public ResponseEntity<String> postRequestOnMail(@ModelAttribute MailRequestDTO mailRequestDTO) {    
        System.out.println("Name: " + mailRequestDTO.getName());
        System.out.println("Mail: " + mailRequestDTO.getMail());
        return ResponseEntity.ok("pages/index");
    }
    
    
}
