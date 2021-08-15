import java.io.*;

public class Borze {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		String code = rd.readLine();

		code = code.replaceAll("--", "2");
		code = code.replaceAll("-\\.", "1");
		code = code.replaceAll("\\.", "0");

		wr.println(code);

	}
	
}