package Homework1;

public class Parents {
    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private String status;

    public String mother() {
        firstName = "Татьяна";
        secondName = "Николаевна";
        lastName = "Иванова";
        age = 40;
        status = "Мама";
        return String.format("Статус:%s, Имя: %s %s %s, возраст: %d.", status, firstName, secondName, lastName, age);
    }

    public String father() {
        firstName = "Сергей";
        secondName = "Витальевич";
        lastName = "Иванов";
        age = 41;
        status = "Папа";
        return String.format("Статус:%s, Имя: %s %s %s, возраст: %d.", status, firstName, secondName, lastName, age);
    }
}
