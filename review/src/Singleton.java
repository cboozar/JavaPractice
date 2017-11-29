/**
 * Created by cboozarjomehri on 11/16/2017.
 * Make Sure only ever 1 instance of class
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        //Singleton Constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

}
