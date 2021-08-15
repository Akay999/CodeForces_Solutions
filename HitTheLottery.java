import java.io.*;

public class HitTheLottery {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(rd.readLine());

		int totalBills = 0;
		// checking for the 100 $ bill
		if(n >= 100){
			totalBills += n / 100;
			n = n % 100;
		}

		// checking for the 20$ bill.
		if(n >= 20){
			totalBills += n / 20;
			n = n % 20;
		}

		// checking for the 10$ bill.
		if(n >= 10){
			totalBills += n / 10;
			n = n % 10;
		}

		// checking for the 5$ bill.
		if(n >= 5){
			totalBills += n / 5;
			n = n % 5;
		}

		totalBills += n;

		wr.println(totalBills);


	}
	
}