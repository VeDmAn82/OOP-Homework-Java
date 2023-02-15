package Homework5.Service;

import Homework5.Model.MathResult;
import Homework5.Service.impls.MathOperations;

public class Service implements MathOperations {

    public MathResult sum(int a, int b) {
        return new MathResult(a + b);
    }

    @Override
    public MathResult difference(int a, int b) {
        return new MathResult(a - b);
    }

    @Override
    public MathResult multiplication(int a, int b) {
        return new MathResult(a * b);
    }
    
    @Override
    public MathResult division(int a, int b) {
        return new MathResult(a / b);
    }
}
