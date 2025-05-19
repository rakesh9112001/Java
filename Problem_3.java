
import java.util.Scanner;

public class Problem_3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int x = sc.nextInt();

	        
	        if (x % 2 == 0) {
	            x = x - 1;
	        }

	        int num = 1;
	        for (int i = 0; i < x; i++) {
	            System.out.print(num);
	            if (i < x - 1) {
	                System.out.print(", ");
	            }
	            num += 2;
	        }

	        sc.close();
	    }
}
