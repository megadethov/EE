package ua.test;

/**
 * Created by mega on 06.10.2016.
 */
public class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) throws ZeroException {
        if (b == 0) throw new ZeroException();
        return a / b;
    }
}
