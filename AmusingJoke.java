import java.io.*;
import java.util.Arrays;

public class AmusingJoke {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		String s1 = rd.readLine();
		String s2 = rd.readLine();
		char[] combine = (s1+s2).toCharArray();
		char[] mix = rd.readLine().toCharArray();

		if(combine.length != mix.length){
			wr.println("NO");
			return;
		}

		Arrays.sort(combine);
		Arrays.sort(mix);

		for(int i = 0; i < combine.length; i++){
			if(combine[i] != mix[i]){
				wr.println("NO");
				return;
			}
		}

		wr.println("YES");
	}
	
}