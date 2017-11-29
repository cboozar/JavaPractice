import java.util.Arrays;

/**
 * Created by cboozarjomehri on 11/14/2017.
 */
public class Sort {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {
        System.out.println("\n-----bubble sort example-----");

        int[] myArr = new int[]{2, 5, 4, 8, 3, 1, 6, 7};
        for (int j = 0; j < myArr.length; j++) {
            for (int i = 0; i < myArr.length - 1; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(myArr));
        }
    }

}
