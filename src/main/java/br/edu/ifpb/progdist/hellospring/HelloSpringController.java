package br.edu.ifpb.progdist.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class HelloSpringController {
    
    @GetMapping("/hello")
    public String StringHello() {
        return "<h1>Hello Jonas!</h1>";
    }
    
}
