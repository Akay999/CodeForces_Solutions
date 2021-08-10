import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);

		String inpstring = scan.nextLine();

		String result = "";
		int strlen = inpstring.length();

		//capitalizing the first letter.
		char firstletter = inpstring.charAt(0);
		if(firstletter <= 122 && firstletter >= 97){
			firstletter -= (char) 32;
		}

		result += firstletter;

		for(int i = 1; i < strlen; ++i){
			result += inpstring.charAt(i);
		}

		System.out.println(result);
	}
}