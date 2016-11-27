package practice.basics.defaultClause;

import practice.basics.defaultClause.interfaces.OpenableCeiling;
import practice.basics.defaultClause.interfaces.Vehcle;

/**
 * Created by takemotto on 11/27/16.
 */
public class DefaultPractice {

    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.desc());
        System.out.println(car.typeName());
        System.out.println(Vehcle.constant);
        System.out.println(Vehcle.className());

        System.out.println("--------------------------");

        Vehcle open = new OpenCar();
        System.out.println(open.desc());
        System.out.println(open.typeName());

    }


    private static class Car implements Vehcle {
        @Override
        public String desc() {
            return "Most common vehcle";
        }

        @Override
        public String typeName() {
            return "car";
        }
    }

    private static class OpenCar implements Vehcle, OpenableCeiling {
        @Override
        public String desc() {
            // you must differenciate by specified interface
            String vehcleDesc = Vehcle.super.desc();
            return vehcleDesc + ":concatenate:" + OpenableCeiling.super.desc();
        }

        @Override
        public String byHand() {
            return "as usual";
        }

        @Override
        public String typeName() {
            return "as usual";
        }
    }

}

