package PST;
import java.util.Scanner;
public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a:");
		int a = sc.nextInt();
		System.out.print("enter b:");
		int b = sc.nextInt();
		
		System.out.println("sum ="+(a+b));
		
		sc.close();
	}

}
