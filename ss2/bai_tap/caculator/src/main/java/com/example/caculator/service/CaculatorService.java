package com.example.caculator.service;

import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService{
    @Override
    public String caculator(String caculator, double number1, double number2) {
        double result = 0;
        switch (caculator){
            case "addition":
                result = number1 + number2;
                return "result: "+result;
            case "subtraction":
                result = number1 - number2;
                return "result: "+result;
            case "multiplication":
                result = number1 * number2;
                return "result: "+result;
            case "division":
                if(number1!=0&number2!=0){
                    result = number1 / number2;
                    return "result: "+result;
                }else {
                    return "Unknown.";
                }

            default:
                return "Please enter the number !";

        }
    }
}
