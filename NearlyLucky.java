import java.io.*;

public class NearlyLucky {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		var num = rd.readLine();
		var len = num.length();

		int count = 0;

		for(int i = 0; i < len; i++){
			if(num.charAt(i) == '4' || num.charAt(i) == '7'){
				count++;
			}
		}

		if(count == 4 || count == 7 )
			wr.println("YES");
		else
			wr.println("NO");
	}
}