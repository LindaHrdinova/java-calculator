package com.github.LindaHrdinova.java_calculator.countdown;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Odpočet do Vánoc.
 */
@Controller
public class CalculatorController {

    public CalculatorController(CalculatorService service) {
    }


    @GetMapping
    public ModelAndView calculator() {
        return new ModelAndView("index");

    }
}