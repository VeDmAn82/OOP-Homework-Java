package Homework1;

public class Children extends Parents {
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String status;

    public Children(String firstName, String secondName, String lastName, int age, String status) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.status = status;

    }

    @Override
    public String toString() {
        return "Ребенок: " + firstName + " " + secondName + " " + lastName + ", " + age + ", " + status;
    } 
}
