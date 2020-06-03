package com.mcaac.Cobranca;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication
public class Cobranca{
    public String var;

	@PostMapping(value = "/")
    public String setCobranca(@RequestBody String cobranca){
        this.var=cobranca;
        return cobranca;
    }

    @GetMapping(value = "/")
    public String getCobranca(){
        return var;
    }
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Cobranca.class);

        app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));

        app.run(args);
    }
}
