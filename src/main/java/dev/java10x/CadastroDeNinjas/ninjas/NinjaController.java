package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ninja")
    public String exemplo(){
        return "Olá";
    }
}
