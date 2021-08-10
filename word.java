import java.util.Scanner;

public class word {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int len = str.length();

		int ucount = 0, lcount = 0;

		for(int i = 0; i < len; i++){
			char cur = str.charAt(i);

			if(cur <= 90 && cur >= 65 )
				ucount++;
			else
				lcount++;

		}

		if(ucount > lcount)
			System.out.println(str.toUpperCase());
		else
			System.out.println(str.toLowerCase());
		
	}
}