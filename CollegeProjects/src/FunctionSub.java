import java.util.*;
public class FunctionSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num:");
        int num1 = sc.nextInt();

        System.out.print("Enter the second num:");
        int num2 = sc.nextInt();

        sc.close();

        int difference = difference(num1, num2);
        System.out.println("The Difference is " + difference);
    }

    static int difference(int num1, int num2) {
        return num1 - num2;

    }
}
