import java.io.*;

public class AntonAndLetters {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		
		String inpstring = rd.readLine();
		wr.println(inpstring);
		char arr[] = inpstring.toCharArray();
		for(char i : arr){
			System.out.println(i + " ");
		}
		System.out.println();


	}
	
}