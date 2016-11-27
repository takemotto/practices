package practice.basics.defaultClause.interfaces;

/**
 * Created by takemotto on 11/27/16.
 */
public interface OpenableCeiling {
    default String desc() {
        return "You can open the ceiling of this.";

    }

    String byHand();
}
