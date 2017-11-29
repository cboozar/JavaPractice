/**
 * Created by cboozarjomehri on 11/15/2017.
 */
public class Exceptions {

    public static void main(String[] args) {
        divideByZero();
        exitBeforeFinallyEx();
        exceptionHierarchyExample();
        try {
            customExceptions();
        } catch (MyException e) {
            System.out.println(e.getMsg());
        }

    }

    public static void divideByZero() {
        System.out.println("\n-----Throws an Exception-----");

        int a = 10;
        int b = 0;
        long c = 0;

        //c = a/b;    //stops here without try/catch

        try {
            c = a / b;      //Fails but keeps going
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Always runs unless error or System.exit");
        }

        System.out.println("Did we make it?");

    }

    public static void exitBeforeFinallyEx() {
        System.out.println("\n-----Finally won't Run on Exit-----");

        try {
            System.exit(0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Always runs unless error or System.exit");
        }
    }

    public static void exitBeforeFinallyContEx() {
        System.out.println("\n-----Finally won't Run on Exit Cont.-----");

        try {
            int a=1, b=0;
            long c = a/b;               //ArithmeticException thrown here
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("Always runs unless error or System.exit");
        }
    }

    public static void exceptionHierarchyExample() {
        System.out.println("\n-----Runs Most Appropriate Catch-----");

        try {
            int a=1, b=0;
            long c = a/b;               //ArithmeticException thrown here
        } catch (ArithmeticException e) {                   // <-Matches Excepion
            System.out.println("My ArithmeticException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {             // <-Never runs, doesn't match thrown exception
            System.out.println("My IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (RuntimeException e) {                      // <-Super of Arithmetic Exception so would run in its place
            System.out.println("My RuntimeException");
            e.printStackTrace();
        } catch (Exception e) {                             // <-Super of all Exceptions, Catch all for exceptions
            System.out.println("My Super Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Always runs unless error or System.exit");
        }
    }

    public static void customExceptions() throws MyException {
        System.out.println("\n-----Throws my custom Exception-----");

        int a=1, b=0;
        long c;
        if (b>0) {
            c = a / b;
        } else {
            throw new MyException(b);
        }
    }

    static class MyException extends Exception {
        private String msg = "Can't Divide by: ";

        public MyException(int n) {
            this.msg = this.msg + n;
        }

        public String getMsg() {
            return this.msg;
        }
    }
}
