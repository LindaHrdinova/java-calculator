package com.github.LindaHrdinova.java_calculator.countdown;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CalculatorController {

    @GetMapping
    public ModelAndView calculator() {
        ModelAndView modelAndView = new ModelAndView("index"); // cesta k /index.ftlh
        modelAndView.addObject("calculator", new CalculatorService());
        return modelAndView;
    }

    @PostMapping("/result")
    public Object form(@Valid @ModelAttribute("form") CalculatorService calculator) {

        return new ModelAndView("result")
                .addObject("NumberResult", calculator.calculatorOperation(calculator.getNumberOne(), calculator.getNumberTwo(), calculator.getCalcOperator()))
                .addObject("NumberOne", calculator.getNumberOne())
                .addObject("NumberTwo", calculator.getNumberTwo())
                .addObject("calcOperator", calculator.getCalcOperator());
    }
}