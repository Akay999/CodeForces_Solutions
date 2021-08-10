import java.util.Scanner;

public class BearAndBrother {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(), b = scan.nextInt();

		int count = 0;
		while(a <= b){
			a *= 3;
			b *= 2;

			count++;
		}

		System.out.println(count);
	}
}