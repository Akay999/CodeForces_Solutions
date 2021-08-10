import java.io.*;

public class ThereWereK {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		int n = Integer.valueOf(rd.readLine());

		int ncopy = n,k = 0, res = n;
		while(--n != 0){
			res &= n;
			if(res == 0){
				k = n;
			}
		}

		wr.println(ncopy - k);
	}
}