package Homework5.View;

import java.util.Scanner;

import Homework5.Model.MathResult;
import Repository.NotNull;

public class ConsoleView {
    public Integer enteringNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
    public void showMathResult(@NotNull MathResult result) {
        System.out.printf("Результат: %s", result.getResult());
    }
    public int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер нужной операции: " + "\n");
        System.out.println("1.Сложение ");
        System.out.println("2.Вычитание ");
        System.out.println("3.Умножение ");
        System.out.println("4.Деление ");
        System.out.println("5.Выход " + "\n");
        return in.nextInt();
    }
}
