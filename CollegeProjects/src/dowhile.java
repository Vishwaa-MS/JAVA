import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		int sum =0;
		int i=0;
		Scanner ans = new Scanner(System.in);
		System.out.print(" Please Enter a Number : ");
		int n = ans.nextInt();
		
		do {
			sum=sum+i;
			i++;
		}
		while(i<=n);
		
		System.out.println("\n Sum of Number from 1 to "+n+" = "+ sum);
	}

}
