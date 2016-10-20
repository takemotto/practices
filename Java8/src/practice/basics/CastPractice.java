package practice.basics;

import java.util.HashMap;

/**
 * Created by takemotto on 10/17/16.
 */
public class CastPractice {

    static class Super_A {

    }

    static class Super_B extends HashMap {

    }

    static class Sub_A extends Super_A {

    }

    static class Sub_B extends Super_B {

    }

    static class Alone {

    }

    public static void main(String[] args) {
        Sub_B sb = new Sub_B();
        Object obj = new Object();

        sb = (Sub_B) obj;
        obj = sb;

        sb = (Sub_B) obj;
        sb = (Sub_B) new HashMap();

    }
}
