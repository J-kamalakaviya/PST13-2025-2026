package PST;

public class Polymorphismhybrid {
	public static void main(String[] args) {
		AIA obj = new AIA();
		obj.method1();
		AIB obj1 = new AIB();
		obj1.method2();
		AIC obj2 = new AIC();
		obj2.method3();
	}

}
class AIA {
	public static void method1(){
		System.out.println("kk");
	}
}
class AIB extends AIA{
	public static void method2(){
		System.out.println("ss");
	}
}
class AIC extends AIA{
	public static void method3(){
		System.out.println("mm");
	}
}