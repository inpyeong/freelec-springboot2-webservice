package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ResponseBody 를 각 메소드마다 선언한 것과 같다.
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
