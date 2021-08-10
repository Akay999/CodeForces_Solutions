import java.util.Scanner;

public class WrongSubtraction {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(), k = scan.nextInt();

		for(int i = 0; i < k; i++){
			if(n % 10 == 0)
				n /= 10;
			else
				n -= 1;
		}

		System.out.println(n);
	}
}