import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		var n = scan.nextInt();

		int cpas = 0; int maxpas = 0, down, up;

		for(var i = 1; i <= n; ++i){
			down = scan.nextInt();
			up = scan.nextInt();

			cpas += up - down;

			maxpas = Math.max(maxpas, cpas);
		}

		System.out.println(maxpas);
	}
}