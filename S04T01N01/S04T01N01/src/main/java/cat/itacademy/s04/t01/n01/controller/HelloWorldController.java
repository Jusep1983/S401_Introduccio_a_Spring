package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // http://localhost:9000/hello-world1?name=Jose
    // http://localhost:9000/hello-world1
    @GetMapping("/hello-world1")
    public String sayHello(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project. ";
    }

    // http://localhost:9000/hello-world2/Jose
    // http://localhost:9000/hello-world2
    @GetMapping(value = {"/hello-world2", "/hello-world2/{name}"})
    public String sayHello2(@PathVariable(required = false) String name) {
        if (name == null) name = "UNKNOWN";
        return "Hello, " + name + ". You are running a Maven project. ";
    }

    // http://localhost:9000/hello-world3?name=Jose&age=41
    // http://localhost:9000/hello-world3
    @GetMapping(value = {"/hello-world3"})
    public String sayHello3(
            @RequestParam(defaultValue = "UNKNOWN") String name,
            @RequestParam(defaultValue = "UNKNOWN") String age
    ) {
        return "Hello, " + name + ", " + age + " years old. You are running a Maven project. ";
    }

}
