import java.util.Scanner;

public class DominioPiling {
	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		var m = scan.nextInt();
		var n = scan.nextInt();

		var reuslt = getDominoes(m, n);

		System.out.println(reuslt);
	}

	static int getDominoes(int m, int n){

		// when number of columns is equal to 1
		if(n == 1){
			if(m == 1)
				return 0;
			else
				return m / 2;
		}

		//when number of columns is grater than 1 and mod of 2
		if(n % 2 == 0)
			return m * (n / 2);

		//when number of columns is greater than 1 and odd
		if(n % 2 != 0){
			if( m == 1)
				return (n-1) / 2;
			if( m % 2 == 0)
				return n * (m / 2);
			else 
				return (n * ((m - 1) / 2)) + ((n - 1) / 2);
		}

		return 0;

	}
}