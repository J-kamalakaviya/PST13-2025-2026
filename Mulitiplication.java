package PST;
import java.util.Scanner;
public class Mulitiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no: ");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++) {
			int mul = num*i;
			System.out.println(num + "x" + i  + "=" + mul);
			
		}
		sc.close();
	}

		
}
	
	


