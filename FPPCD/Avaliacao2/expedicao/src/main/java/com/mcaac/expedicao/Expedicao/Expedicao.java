package com.mcaac.expedicao.Expedicao;


import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication
public class Expedicao{
    public String var;

    @PostMapping(value = "/")
    public String setExpedicao(@RequestBody String expedicao){
        this.var=expedicao;
        return expedicao;
    }

    @GetMapping(value = "/")
    public String getExpedicao(){
        return var;
    }
            public static void main(String[] args) {
                SpringApplication app = new SpringApplication(Expedicao.class);
        
                app.setDefaultProperties(Collections.singletonMap("server.port", "8082"));
        
                app.run(args);
            }
    }
    