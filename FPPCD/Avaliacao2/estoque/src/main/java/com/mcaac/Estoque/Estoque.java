package com.mcaac.Estoque;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication
public class Estoque {
    public String var;

    @PostMapping(value = "/")
    public String setEstoque(@RequestBody String estoque){
        this.var=estoque;
        return estoque;
    }
    @GetMapping(value = "/")
    public String getCobranca(){
        return var;
    }

        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(Estoque.class);
    
            app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
    
            app.run(args);
        }
}