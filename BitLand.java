import java.util.Scanner;

public class BitLand {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		//flushing out \n from the input buffer
		scan.nextLine();

		var x = 0;

		for(var i =0; i < n; i++){
			var temp = scan.nextLine();
			if(temp.equals("++x") || temp.equals("x++")  || temp.equals("++X") || temp.equals("X++") )
				x++;
			else if(temp.equals("--x") || temp.equals("x--") || temp.equals("--X") || temp.equals("X--"))
				x--;
			else
				System.out.println("Error");

		}

		System.out.println(x);
	}
}