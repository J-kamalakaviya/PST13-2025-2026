package PST;
import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");	
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("swapping value: "+ a);
		sc.close();
	
		
		
		
		
	}

}
