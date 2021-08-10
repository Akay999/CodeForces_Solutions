import java.io.*;

public class Drinks {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		int n = Integer.valueOf(rd.readLine());
		String[] inpStr = rd.readLine().split("\\s");

		int len = inpStr.length, sum = 0;

		for(int i = 0; i < len; i++){
			sum += Integer.valueOf(inpStr[i]);
		}	

		double res = (double) sum / len;
		wr.printf("%.5f", res);
	}
}