/**
 * Created by cboozarjomehri on 11/14/2017.
 * Examples of using Interfaces
 */
public class Interface {

    public static void main(String[] args) {
        System.out.println("\n-----interface class example-----");

        BankInterface fed = new FedInterface();
        BankInterface greek = new GreekBank();

        fed.deposit();
        fed.withdraw();
        fed.history();

        greek.deposit();
        greek.withdraw();
        greek.history();
        ((GreekBank)greek).isBankRupt();    //Interface means it will only know to run interface specific methods
    }
}

class FedInterface implements BankInterface {
    @Override
    public void deposit() {
        System.out.println("The people make deposits");
    }

    @Override
    public void withdraw() {
        System.out.println("The people make a withdrawl");
    }

    @Override
    public void history() {
        System.out.println("Been around for 200 years!");
    }
}

class GreekBank implements BankInterface {
    public void deposit() {
        System.out.println("All of Greece's Money");
    }

    @Override
    public void withdraw() {
        System.out.println("What Money? we spent it");
    }

    @Override
    public void history() {
        System.out.println("Longer than its future....");
    }

    public void isBankRupt() {
        System.out.println("Probably!");
    }
}

interface BankInterface {
    void deposit();
    void withdraw();
    void history();

}