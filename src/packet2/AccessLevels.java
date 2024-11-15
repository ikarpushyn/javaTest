package packet2;

public class AccessLevels {

    protected int protectedVar = 3;
    public int publicVar = 2;
    public int defaultVar = 1;
    private int privateVar = 6;

    public int getProtectedVar() {
        return protectedVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

}
