package packet1;

import packet2.AccessLevels;

public class TestAccessOtherPackages {
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println(obj.publicVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.getPrivateVar());
        System.out.println(obj.getProtectedVar());


    }
}
