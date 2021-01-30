import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			for(int j=N-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
