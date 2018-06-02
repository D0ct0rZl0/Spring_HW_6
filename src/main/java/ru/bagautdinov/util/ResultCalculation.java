package ru.bagautdinov.util;

import ru.bagautdinov.model.MathOper;

public class ResultCalculation {

    private String result;

    public ResultCalculation(MathOper calc) {
        switch (calc.getOperation()) {
            case "+":
                this.result = String.valueOf(Double.valueOf(calc.getOldNumber()) + Double.valueOf(calc.getNewNumber()));
                break;
            case "/":
                this.result = String.valueOf(Double.valueOf(calc.getOldNumber()) / Double.valueOf(calc.getNewNumber()));
                break;
            case "*":
                this.result = String.valueOf(Double.valueOf(calc.getOldNumber())*Double.valueOf(calc.getNewNumber()));
                break;
            case "-":
                this.result = String.valueOf(Double.valueOf(calc.getOldNumber())-Double.valueOf(calc.getNewNumber()));
                break;
        }
    }

    public String getResult() {
        return result;
    }
}
