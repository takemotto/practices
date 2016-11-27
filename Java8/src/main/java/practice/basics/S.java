package practice.basics;

/**
 * Created by takemotto on 11/27/16.
 */
public class S {
    static String classVariable;
    String instanceVariable;

    S(String c, String i) {
        classVariable = c;
        instanceVariable = i;
    }

    static String classMethod() {
        return "classMethod";

    }

    String instanceMethod() {
        return "instanceMethod";
    }

}
