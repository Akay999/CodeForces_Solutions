import java.util.Scanner;

public class LongWords {
	public static void main(String[] args) {
		 final Scanner scan = new Scanner(System.in);
		 var n = scan.nextInt();
		 var warray = new String[n];

		 //to flush out an extra \n in the input buffer.
		 scan.nextLine();

		 //iterating over each word
		 for(var i = 0; i < n; ++i){
		 	warray[i] = scan.nextLine();
		 	var len = warray[i].length();
		 	if(len > 10){
		 		var temp = warray[i].charAt(0) + String.valueOf(len - 2) + warray[i].charAt(len - 1);
		 		warray[i] = temp;
		 	}
		 }

		 for(var x : warray){
		 	System.out.println(x);
		 }
	}
}