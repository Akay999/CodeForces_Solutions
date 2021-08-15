import java.io.*;

public class Pangram {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(rd.readLine());

		String inpstr = rd.readLine().toLowerCase();
		int letters[] = new int[26];

		for(int i = 0; i < n; i++){
			int index = inpstr.charAt(i) - 97;
			letters[index]++;
		}

		for(int i : letters){
			if(i == 0){
				wr.println("NO");
				return;
			}
		}

		wr.println("YES");
		
	}
	
}