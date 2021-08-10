import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {
	public static void main(String[] args){
		final Scanner scan = new Scanner(System.in);

		var bmatrix = new int[5][5];

		// variable to store the given position of the element
		int x = -1, y = -1;

		for(var i = 1; i <= 5; i++){
			for(var j = 1; j <= 5; j++){
				var temp = bmatrix[i - 1][j - 1] = scan.nextInt();

				if(temp != 0){
					x = i;
					y = j;
				}
			}
		}

		System.out.println(Math.abs(x - 3) + Math.abs(y - 3));
	}
}