package com.example.demo;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping
    public class TestController {
        @GetMapping("/hello")
        public String sayHello(){
            return "Budget Manager API is up and running!";
        }
}
