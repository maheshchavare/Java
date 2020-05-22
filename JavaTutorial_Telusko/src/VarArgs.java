class Calc {
	public int add(int ... n) { // ... represents variable length arguments
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class VarArgs {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("Variable length arguments demo: " + c.add(100,500,1000,2000));
	}
}