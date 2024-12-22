package xyz.gabrielaraujo.fundamentos.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/controller") 
public class PrimeiraController {
    
    
    @GetMapping("/primeiraRota/{id}")
    public String primeiroMetodo(@PathVariable(name = "id") String qualquerNome){
        return "O parametro é " + qualquerNome;
    }


    @GetMapping("/metodoQueryParams")
    public String metodoQueryParams(@RequestParam Map<String, String> allParams){
        return "O parametro com queryParams é " + allParams.entrySet();
    }

    @PostMapping("/metodoBodyParams")
    public String metodoBodyParams(@RequestBody Usuario usuario){
        return usuario.username();
    }

    public record Usuario(String username){}
    
}
