public class Person {


    public String name;
    private String secondName;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }
}
