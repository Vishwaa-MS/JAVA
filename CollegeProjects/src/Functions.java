import java.util.*;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num:");
        int num1 = sc.nextInt();

        System.out.print("Enter the second num:");
        int num2 = sc.nextInt();

        System.out.print("Enter the third num:");
        int num3 = sc.nextInt();

        System.out.print("Enter the fourth num:");
        int num4 = sc.nextInt();
        sc.close();

        int product = product(num1, num2, num3, num4);
        System.out.println("The Product is " + product);

    }

    static int product(int num1, int num2, int num3, int num4) {
        return num1*num2*num3*num4;
    }
}
