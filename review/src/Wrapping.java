/**
 * Created by cboozarjomehri on 11/14/2017.
 */
public class Wrapping {

    public static void main(String[] args) {
        objectWrappingEx();
        autoBoxingEx();
        castingEx();
    }

    public static void objectWrappingEx() {
        System.out.println("\n-----Wrapping Example-----");

        Integer int1 = new Integer(9);
        Integer int2 = new Integer(int1);

        System.out.println("int1 == int2: " + (int1 == int2));
        System.out.println("int1.equals(int2): " + (int1.equals(int2)));
    }

    public static void autoBoxingEx() {
        System.out.println("\n-----Autoboxing Example-----");

        Integer int1 = 9;
        Integer int2 = new Integer(9);
        Integer int3 = 9;

        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
        System.out.println("int3: " + int3);
        System.out.println("int1 == int2: " + (int1 == int2));
        System.out.println("int1.equals(int2): " + (int1.equals(int2)));
        System.out.println("int1 == int3: " + (int1 == int3));
        System.out.println("int1.equals(int3): " + (int1.equals(int3)));
    }

    public static void castingEx() {
        System.out.println("\n-----Casting Example-----");

        long myLong = 12345;        //cast int to long
        System.out.println("int implicitly cast to long:" + myLong);
        int myInt = (int) myLong;  //Explicit casting to int
        System.out.println("long explicitly cast to int:" + myInt);

        int pi = (int) 3.14159;  //Explicit casting to int
        System.out.println("pi explicitly cast to int:" + pi);

    }
}
