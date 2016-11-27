package practice.basics;

/**
 * Created by takemotto on 11/27/16.
 */
public class SuperPractice extends S{

    //hide super's static method
    static String classMethod() {
        return "hidden";
    }

    // this class's classMethod is called
    void echoClassMethod() {
        System.out.println(classMethod());
    }

    SuperPractice() {
        super(null, null);
        // or default value
    }

    // even though the method is overridden, you can call super's.
    void callSuper() {
        System.out.println(super.instanceMethod());
    }

    @Override
    String instanceMethod() {
        String str = "added" + super.instanceMethod();
        return str;
    }

    public static void main(String[] args) {
        SuperPractice superPractice = new SuperPractice();

        System.out.println(superPractice.instanceMethod());
        superPractice.callSuper();

        superPractice.echoClassMethod();
    }

}
