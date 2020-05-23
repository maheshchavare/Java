abstract class Human {	// class has to be abstract when it contains abstract methods
	public abstract void eat();	// abstract method, wherein method impl is not defined
	
	public void walk() {	// non-abstract method
		
	}
}

class Man extends Human {	// concrete class, wherein abstract method from parent class is implemented
	public void eat() {
		
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Human h1 = new Man();
		
	}
}