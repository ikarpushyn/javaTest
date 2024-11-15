
public class Main {
    public static void main(String[] args) {

        Person user1 = new Person();
        Person user2 = new Person("Ilya");
        Person user3 = new Person("Ilya", 100);
        Person user4 = new Person("Ilya", "Karpushyn");

        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user2.name);
        System.out.println(user2.age);

    }
}