package ru.semyak.springcourse.springlesson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {

    @GetMapping("/commands")
    public String addition(@RequestParam("action") String action,
                           @RequestParam("a") double a,
                           @RequestParam("b") double b) {
        double res;
        switch (action) {
            case "addition":
                res = a + b;
                return "При сложении параметров, получится овтет = " + res;
            case "subtraction":
                res = a - b;
                return "При вычитании параметров, получится овтет = " + res;
            case "multiplication":
                res = a * b;
                return "При умножении параметров, получится овтет = " + res;
                case "division":
                res = a / b;
                return "При делении параметров, получится овтет = " + res;
            default:
                return "ошибка 404, проверьте параметры и значения";
        }
    }
}
