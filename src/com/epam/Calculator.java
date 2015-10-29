package com.epam;

class Calculator
{
    public static double calculate (String mathString) {

        String[] workString = mathString.split("[ ]");
        double number_1 = Double.valueOf(workString[0]);
        double number_2 = Double.valueOf(workString[2]);

        double result = 0;

        switch(workString[1])
        {
            case "+": result = number_1+number_2;
                break;
            case "-": result = number_1-number_2;
                break;
            case "*": result = number_1*number_2;
                break;
            case "/": result = number_1/number_2;
                break;
        }
        return result;
    }

}
