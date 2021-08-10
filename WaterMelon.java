import java.util.Scanner;

public class WaterMelon {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		if(w % 2 == 0 && w >= 4)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}