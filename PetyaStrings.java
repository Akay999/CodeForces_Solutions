import java.util.Scanner;

public class PetyaStrings {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);
		var s1 = scan.nextLine();
		var s2 = scan.nextLine();

		boolean isequal = true;

		for(var i = 0; i < s1.length(); i++){
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			//Converting the chars to upercase
			c1 = (c1 >= 97) ? (char) (c1 - 32) : (char) c1;
			c2 = (c2 >= 97) ? (char) (c2 - 32) : (char) c2;

			if(c1 == c2)
				continue;

			if(c1 > c2){
				isequal = false;
				System.out.println("1");
				break;
			}
			else{
				isequal = false;
				System.out.println("-1");
				break;
			}
		}

		if(isequal)
				System.out.println("0");
	}
}