package Homework2;

public final class ImmutableCat {
    private String name;
    private String breed;
    private String eyeColor;
    private int age;
 
    public ImmutableCat(String name, String breed, String eyeColor, int age)
    {
        this.name = name;
        this.breed = breed;
        this.eyeColor = eyeColor;
        this.age = age;
        System.out.println("Вот новый кот! Его зовут " + this.name + ", порода " + this.breed + ", цвет глаз " + this.eyeColor + ", возраст " + this.age + " лет ");
    }

    public ImmutableCat getName(String name) {
        ImmutableCat c = new ImmutableCat(name, this.breed, this.eyeColor, this.age);
        return c; 
    }
 
    public ImmutableCat getBreed(String breed)
    {
        ImmutableCat c = new ImmutableCat(this.name, breed, this.eyeColor, this.age);
        return c;
    }
 
    public ImmutableCat getEyeColor(String eyeColor)
    {
        ImmutableCat c = new ImmutableCat(this.name, this.breed, eyeColor, this.age);
        return c;
    }

    public ImmutableCat getAge(int age)
    {
        ImmutableCat c = new ImmutableCat(this.name, this.breed, this.eyeColor, age);
        return c;
    }

        
}

