import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMath {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);

		String inpstring = scan.nextLine();

		int ones = 0, twos = 0, threes = 0;

		for(int i = 0; i < inpstring.length(); i++){
			switch (inpstring.charAt(i)) {

				case '1' : {
					ones++;
					break;
				}

				case '2' : {
					twos++;
					break;
				}

				case '3' : {
					threes++;				
					break;
				}
			}
		}

		var sum = ones + twos + threes;

		var i = 0;
		do{

			if(i >= 1){
				System.out.print("+");
			}

			if(ones != 0){
				System.out.print('1');
				ones--;
			}
			else if(twos != 0){
				System.out.print("2");
				twos--;
			}
			else if(threes != 0){
				System.out.print("3");
				threes--;
			}

			i++;
		} while(i < sum);

		// System.out.println();

	}
}