import java.util.Scanner;

public class StonesOnTable {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);
		var n = scan.nextInt();

		//flushing out an extra \n form input buffer
		scan.nextLine();

		String sequence = scan.nextLine();

		var counter = 0;

		for(var i = 0; i < n; ++i){
			int k = i + 1;
			while(k < n && sequence.charAt(k) == sequence.charAt(i)){
				counter++;
				k++;
			}

			i = k - 1;
		}

		System.out.println(counter);
	}
}