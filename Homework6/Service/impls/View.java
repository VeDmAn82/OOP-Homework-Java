package Homework6.Service.impls;

import Homework5.Model.MathResult;

public interface View {
    void showMathResult(MathResult result);
    Integer enteringNumbers();
    int showMenu();
}
