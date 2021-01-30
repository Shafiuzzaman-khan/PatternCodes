import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int N = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			
			for(int j=N+4;j>=i;j--) {
				System.out.print(" ");
			}
			
			    if(i==1)
			    {
			    	System.out.println(i);
			    }
			    else
			    {
			    	for(int k=1;k<i+2;k++) {
						System.out.print(k+" ");
					}
					System.out.println();
			    }
				
			
			
			}

		}
			
		}

	



