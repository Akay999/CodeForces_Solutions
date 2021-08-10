import java.util.*;

public class BoyOrGirl {
	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		String inpstr = scan.nextLine();
		char[] strarray = inpstr.toCharArray();
		Arrays.sort(strarray);

		var len = strarray.length;
		int temp = strarray[0];
		int sum = 1;
		for(int i = 1; i < len; ++i){
			if(temp != strarray[i]){
				temp = strarray[i];
				sum++;
			}
		}

		if(sum % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}
}