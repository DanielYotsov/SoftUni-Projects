package ObjectsAndClasses_Exercise06.SortPeopleByAge;

public class Person2 {
    private final String name;
    private final String ID;
    int age;

    public Person2(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " with ID: " + ID + " is " + age + " years old.";
    }
}
