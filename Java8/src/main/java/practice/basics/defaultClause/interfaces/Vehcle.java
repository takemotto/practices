package practice.basics.defaultClause.interfaces;

/**
 * Created by takemotto on 11/27/16.
 */
public interface Vehcle {

    public static final Object constant = "const in interface";


    default String desc() {
        return "The things you can ride on";
    }

    static String className() {
        return "vehcle";
    }

    String typeName();

}
