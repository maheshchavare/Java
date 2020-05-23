class ParentClass {
	public ParentClass() {
		System.out.println("Inside ParentClass");
	}
	public ParentClass(int i) {
		System.out.println("Inside ParentClass - int constructor");
	}
}

class ChildClass extends ParentClass {
	public ChildClass() {
		//super();	// default call to super() is made - constructor with no args
		System.out.println("Inside ChildClass");
	}
	public ChildClass(int i) {
		//super(); // default call to super() is made - constructor with no args
		super(i); // pass the arg to call parent's constructor with args
		System.out.println("Inside ChildClass - int constructor");
	}	
}

public class SuperMethod {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass(5);
	}
}