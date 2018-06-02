package ru.bagautdinov.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bagautdinov.model.MathOper;
import ru.bagautdinov.util.ResultCalculation;

@Controller
public class CalculatorViewController {

    @RequestMapping("/calculator")
    public String onCalculatorView() {
        return "calc";
    }

    @MessageMapping("/calculate")
    @SendTo("/calculator")
    public ResultCalculation calculate(MathOper oper) {
        return new ResultCalculation(oper);
    }

}
