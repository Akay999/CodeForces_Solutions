import java.util.Scanner;

public class Team {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);
		var Pnum = scan.nextInt();
		var Pcount = 0;
		for(var i = 0 ; i < Pnum; ++i){
			var Scount = 0;
			for(var j = 0; j < 3; ++j){
				var temp = scan.nextInt();
				if(temp == 1)
					Scount++;
			}
			if(Scount >= 2)
				Pcount++;
		}
		System.out.println(Pcount);
	}
}