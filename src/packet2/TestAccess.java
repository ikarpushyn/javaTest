package packet2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevels object = new AccessLevels();

        System.out.println(object.defaultVar);
        System.out.println(object.protectedVar);
        System.out.println(object.publicVar);
    }
}
