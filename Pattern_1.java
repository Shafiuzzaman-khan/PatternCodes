import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int M = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of colums");
		int N = sc1.nextInt();
		
		for(int i=1; i<=M;i++) {
			
			for(int j=1; j<=N;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
