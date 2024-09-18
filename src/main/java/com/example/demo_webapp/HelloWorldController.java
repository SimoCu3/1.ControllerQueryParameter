package com.example.demo_webapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String HelloWorld(){
        return "Hello World!";
    }
    //localhost:8080/v1/helloWorld

    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam(required = true) String nome, @RequestParam(required = false, defaultValue = ".") String cognome){
        return "Ciao " + nome + " " + cognome + "!";
    }
    //localhost:8080/v1/ciao?nome=Simone&cognome=Cuccu
    //localhost:8080/v1/ciao?nome=Simone

    

}
