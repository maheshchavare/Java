class Outer {
	
	Outer() {
		System.out.println("Outer - constructor");
	}
	
	public void outerMethod() {
		System.out.println("Outer - show method");
	}
	
	class Inner {
		
		Inner() {
			System.out.println("Inner - constructor");
		}
		
		public void innerMethod() {
			System.out.println("Inner - show method");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerMethod();
		
		Outer.Inner oi = o.new Inner();
		oi.innerMethod();
	}
}