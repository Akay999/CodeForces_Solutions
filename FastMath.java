import java.io.*;

public class FastMath {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		//taking input
		String str1 = rd.readLine();
		String str2 = rd.readLine();

		int len = str2.length();

		String res = "";

		for(int i = 0; i < len; i++){
			if(str1.charAt(i) != str2.charAt(i))
				res += "1";
			else
				res += "0";
		}

		wr.println(res);

	}
	
}