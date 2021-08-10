import java.util.Scanner;

public class SoldierBanannas {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		int k = scan.nextInt(), n = scan.nextInt(), w = scan.nextInt();

		int answer = (w * (w + 1) * k) / 2;
		answer -= n;

		if(answer < 0)
			System.out.println(0);
		else
			System.out.println(answer);

	}
}