/**
 * Created by cboozarjomehri on 11/15/2017.
 */
public class Encapsulate {


    public Encapsulate(int n, String s) {

    }
}

final class MyPerson {
    int age = 0;
    String name = "";

    private MyPerson (int age, String name) {
        this.age = age;
        this.name = name;
    }
}
