/**
 * Created by cboozarjomehri on 11/14/2017.
 */
public class Abstract {

    public static void main(String[] args) {
        System.out.println("\n-----abstract class example-----");

        Bank federalReserve = new AbstractFed();
        Bank worldBank = new WorldBank();

        federalReserve.deposit();
        federalReserve.withdraw();
        federalReserve.setInterest();
        federalReserve.history();
        System.out.println(federalReserve.totalValue());
        ((AbstractFed)federalReserve).scope();

        worldBank.deposit();
        worldBank.withdraw();
        worldBank.setInterest();
        worldBank.history();
        System.out.println(worldBank.totalValue());

    }

}

abstract class Bank {

    public void deposit() {
        System.out.println("Make a deposit");
    }

    public void withdraw() {
        System.out.println("Make a withdraw");
    }

    public void setInterest() {
        System.out.println("Interest rate is set by Federal Reserve");
    }

    int totalValue() {
        return 0;
    }

    public abstract int history();
}

class AbstractFed extends Bank {
    public void setInterest() {
        System.out.println("Setting interest rates");
    }

    public void scope() {
        System.out.println("The USA");
    }

    @Override
    public int history() {
        System.out.println("Been around for 200 years!");
        return 200;
    }

    int totalValue() {
        return 10000000;
    }
}

class WorldBank extends Bank {
    public void deposit() {
        System.out.println("All of Greece's Money");
    }

    @Override
    public int history() {
        System.out.println("Been around for 60 years?");
        return 60;
    }
}