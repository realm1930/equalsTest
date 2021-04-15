import java.util.Scanner;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class equalsTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String test = "bla";
        String test2 = "bla";
        String test3;

        System.out.println("Schrijf bla: ");
        test3 = sc.next();


        System.out.println(test==test3);
        System.out.println(test.equals(test3));

        System.out.println(test==test2);
        System.out.println(test.equals(test3));

    }
}
