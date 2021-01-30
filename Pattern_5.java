import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines(ODD Lines)");
		int Lines = sc.nextInt();
		
		int Mid = (Lines+1)/2;
		
		for(int i=1;i<=Mid;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
			}
			
			for(int i=Mid+1;i<=Lines;i++) {
				
				for(int j=Mid-1;j>0;j--) {
					
					System.out.print("*");
				}
			    Mid--;
				System.out.println();
		}

	}

}
