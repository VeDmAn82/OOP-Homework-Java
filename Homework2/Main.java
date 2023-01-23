package Homework2;


public class Main {
    public static void main(String[] args) {
        ImmutableCat cat1 = new ImmutableCat("Матроскин", "серый", "желтые", 5);
        ImmutableCat cat2 = cat1.getBreed("полосатый");
    } 
}
