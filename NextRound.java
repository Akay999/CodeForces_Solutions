import java.util.Scanner;

public class NextRound {
	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		var n = scan.nextInt();
		var k = scan.nextInt();

		var qualifiers = getQualifiers(k, n);
		System.out.println(qualifiers);
	}

	static int getQualifiers(int k, int n) {
		var qualifiers = 0;
		int thval = 0;
		for(int i = 1; i <= n; ++i){
			var temp = scan.nextInt();

			//termination condition when we encounter a 0 before i reaches to k
			if(i <= k && temp == 0) {
				return qualifiers;
			}

			//getting the thrushold value.
			if(i == k)
				thval = temp;

			//extending condition when other contestant have equal score to the kth place finisher
			if(i > k && temp == thval){
				qualifiers++;
				continue;
			}
			else if( i > k && temp < thval)
				return qualifiers;

			qualifiers++;

		}

		return qualifiers;
	}
}