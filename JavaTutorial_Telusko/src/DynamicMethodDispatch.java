class Parent {
	public void show() {
		System.out.println("In Parent");
	}
}

class Child1 extends Parent {
	public void show() {
		System.out.println("In Child1");
	}
}

class Child2 extends Parent {
	public void show() {
		System.out.println("In Child2");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.show();	// normal call to a method
		
		Child1 c1 = new Child1();
		c1.show(); // normal call to a method
		
		Child2 c2 = new Child2();
		c2.show(); // normal call to a method
		
		Parent p1 = new Child1();
		p1.show();	// runtime polymorphism - dynamically calling show method from child class
		
		p1 = new Child2();
		p1.show();
	}
}