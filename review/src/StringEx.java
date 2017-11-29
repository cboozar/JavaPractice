import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by cboozarjomehri on 11/14/2017.
 */
public class StringEx {

    public static void main(String[] args) {
        String input = "HelloWorld";
        print_forwards(input);
        print_backwards(input);
        immutabilityAndUtils();
        print_first_non_repeat(input);
        compare_strings();
    }

    public static void print_forwards(String input) {
        System.out.println("\n-----print a string forwards-----");

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }
        System.out.print("\n");
    }

    public static void print_backwards(String input) {
        System.out.println("\n-----print a string backwards-----");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.print("\n");
    }

    public static void immutabilityAndUtils() {
        System.out.println("\n-----immutabilityAndUtils example-----");

        String str1 = "str1";
        String str2 = "str2";
        str2.concat(str1);
        System.out.println(str2);               //Str 2 is immutable so concat will not overwrite
        System.out.println(str2.concat(str1));  //concat will return value to overwrite though

        System.out.println("First letter: " + str1.charAt(0));
        System.out.println("Length:" + str1.length());
        System.out.println("As String:" + str1.toString());
        System.out.println("Ignore Case compare to 'STr1':" + str1.equalsIgnoreCase("STr1"));
    }

    public static void print_first_non_repeat(String input) {
        System.out.println("\n-----print first none repeated char-----");
        System.out.println("Input: " + input);

        //NOTE: LinkedHashMap will Maintain order, HashMap is tree HashMap which sorts
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (char char_at_i : input.toCharArray()) {
            if (chars.containsKey(char_at_i)) {
                chars.put(char_at_i, chars.get(char_at_i) + 1);
            } else {
                chars.put(char_at_i, 1);
            }
        }

        for (char key : chars.keySet()) {
            if (chars.get(key) < 2) {
                System.out.println("Output: " + key);
                break;
            }
        }

        String allChars = "";
        for (char key : chars.keySet()) {
            allChars += key + "" + chars.get(key);
        }
        System.out.println("Breakdown: " + allChars);
    }

    public static void compare_strings() {
        System.out.println("\n-----print first none repeated char-----");

        String str1 = "str1";
        String str2 = "str1";
        String str3 = new String("str1");
        String str4 = new String(str1);
        String str5 = new String(str4);

        if (str1 == str2) {
            //Should print (compare by reference)
            System.out.println("str1 = str2");
        }

        if (str1 == str3) {
            //Should not print (compare by reference)
            System.out.println("str1 = str3");
        }

        if (str1 == str4) {
            //Should not print (compare by reference)
            System.out.println("str1 = str4");
        }

        if (str2.equals(str3)) {
            //Should print (shallow compare by value)
            System.out.println("str2 = str3");
        }

        if (str3 == str4) {
            //Should not print (compare by reference)
            System.out.println("str3 = str4");
        }

        if (str3.equals(str5)) {
            //Should print (shallow compare by value)
            System.out.println("str3 = str5");
        }
    }

}
