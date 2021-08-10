import java.io.*;

public class Translation {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		String s = rd.readLine();
		String t = rd.readLine();
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		if(str.toString().equals(t.toString()))
			wr.println("YES");
		else
			wr.println("NO");
	}
}