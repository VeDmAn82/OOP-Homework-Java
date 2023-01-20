package Homework1;

public class Main {
    public static void main(String[] args) {
        Children child = new Children("Дмитрий", "Сергеевич", "Иванов", 8, "Сын");
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
    }
}
