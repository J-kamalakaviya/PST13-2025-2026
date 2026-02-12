package PST;
import java.util.Scanner;
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int original= num;
		int count = 0;
		int sum = 0;
		if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                count++;
                num = num/ 10;
            }
        }num = original;
         while(num!=0) {
        	 int digit = num%10;
        	 int power=1;
        	 for(int i=1;i<=count;i++) {
        		 power=power*digit;
        	 }
        	 sum = sum+power;
        	 num = num/10;
         }
		
		
		if(sum==original) {
			System.out.println("amstrong number:"+original);
		}else {
			System.out.println("not amstrong number:"+original)		;
		}
				
		sc.close();	
		}
	} 

