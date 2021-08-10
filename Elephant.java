import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int steps = 0;
		for(int i = 5; i > 0; i--){
			steps += (x / i);
			x = x % i;
			if(x == 0)
				break;
		}

		System.out.println(steps);
	}
}