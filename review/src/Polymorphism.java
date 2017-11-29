/**
 * Created by cboozarjomehri on 11/14/2017.
 */
public class Polymorphism {

    public static void main(String[] args) {
        overloadingEx();
        overridingEx();
    }

    public static void overloadingEx() {
        System.out.println("\n-----Overloading happens at Compile Time-----");

        MyMathClass math = new MyMathClass();

        System.out.println(math.add(1, 2));
        System.out.println(math.add(1, 2, 3, 4));
    }

    public static void overridingEx() {
        System.out.println("\n-----Overriding happens at Runtime-----");

        Animal animal = new Animal();
        Animal dog = new Dog();

        System.out.println(animal.speak());
        System.out.println(dog.speak());
    }
}

class Animal {
    String speak() {
        System.out.println("I'm an animal");
        return "Howl";
    }
}

class Dog extends Animal {
    String speak() {
        System.out.println("I'm a dog");
        return "woof!";
    }
}

class MyMathClass {

    int add(int a, int b) {
        System.out.println("Just adding 2 numbers");
        return a + b;
    }

    int add(int... nums) {
        System.out.println("Just adding all the numbers");

        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
}