public class Arrays {

	public static void main(String[] args) {
		// Just to prove that an array contains all zeroes without any initialization
		System.out.println("Array contains all zeroes unless we assign any values");
		int a[] = new int[4];
		for (int i=0;i<4;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n\n");
		
		// Normal for-loop for 1D array
		System.out.println("1D array with normal for-loop:");
		int b[] = {2,100,679,345};
		for (int i=0;i<4;i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("\n");
		
		// Enhanced for-loop for 1D array
		System.out.println("1D array with enhanced for-loop:");
		int c[] = {1,10,100,1000};
		for (int i : c) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
			
		// Normal for-loop for 2D array
		System.out.println("2D array with normal for-loop:");
		int d[][] = {
						{1,10,100,1000},
						{2,20,200,2000},
						{3,30,300,3000}
					};
		for (int i=0;i<3;i++) {
			for (int j=0;j<=3;j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Enhanced for-loop for 2D array
		System.out.println("2D array with enhanced for-loop:");
		int e[][] = {
						{1,10,100,1000},
						{2,20,200,2000},
						{3,30,300,3000}
					};
		for (int i[] : e) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}		
	}
}