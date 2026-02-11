package PST;
import java.util.Scanner;
public class Stars {
	public static void main(String[] args) {
		System.out.println("enter no:");
		Star obj = new Star();
		obj.Class1();
		System.out.println("enter no:");
		HorizontalStar2 obj1 = new HorizontalStar2();
		obj1.HorizontalClass2();
	}

}
class Star{
	static void Class1() {
		Scanner sc = new Scanner(System.in);
		int numstar = sc.nextInt();
		for (int i=0; i<numstar; i++) {
			System.out.println("*");
		}
	
	}
}
class HorizontalStar2{
	static void  HorizontalClass2() {
		Scanner sc = new Scanner(System.in);
		int numstar = sc.nextInt();
		for (int i=0; i<numstar; i++) {
			System.out.print(" *");
		}
	
	}
}