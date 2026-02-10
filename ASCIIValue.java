package PST;
import java.util.Scanner;
public class ASCIIValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();

        Ascii1 obj = new Ascii1(); 
        obj.findAscii(ascii);
    }
	
}

class Ascii1{
	void findAscii(int ascii) {
		char ch = (char)ascii;
		System.out.println("ascii"  + ch);
		
		
	}
}


