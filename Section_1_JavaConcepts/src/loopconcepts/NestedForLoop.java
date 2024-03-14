package loopconcepts;

public class NestedForLoop {

	public static void main(String[] args) {
		// Number printing in pattern
		int l = 1;
		for (int i=1; i<5; i++) {
				for(int j=1; j<=i; j++) {
					
					System.out.print(l + "  ");
					l++;
				}
				System.out.println();
			}
		

		// Number printing in pattern
		int k = 1;
		for (int i=0; i<=4; i++) {
				for(int j=1; j<=4-i; j++) {
					
					System.out.print(k + "  ");
					k++;
				}
				System.out.println();
			}


}			
}
