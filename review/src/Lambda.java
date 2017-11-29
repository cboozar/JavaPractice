import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cboozarjomehri on 11/14/2017.
 * Lambda use examples
 */
public class Lambda {

    public static void main(String[] args) {
        threadingEx();
        sortingEx();
    }

    public static void threadingEx() {
        System.out.println("\n-----threading with lambda!-----");

        Thread ext = new Extended();

        Runnable r = new Implemented();
        Thread imp = new Thread(r);

        Runnable lambda = () -> System.out.println(Thread.currentThread().getName() + " Now with lambda!");
        Thread lamb = new Thread(lambda);

        ext.start();
        imp.start();
        lamb.start();
    }

    public static void sortingEx() {
        System.out.println("\n-----sorting with lambda!-----");

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe"));
        people.add(new Person("Jane", "Doe"));
        people.add(new Person("Tom", "Boy"));
        people.add(new Person("0110", "1001"));

        System.out.println(people);

        Collections.sort(people, (p1, p2) -> p1.getFirst().compareTo(p2.getFirst()));
        System.out.println(people);
    }
}

class Extended extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Extended is Running...");
    }
}

class Implemented implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Implemented is Running...");

    }
}

class Person {
    private String first;
    private String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return this.first;
    }

    public String toString() {
        return this.first + " " + this.last;
    }
}