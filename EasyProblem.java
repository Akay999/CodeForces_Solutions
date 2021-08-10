import java.io.*;

public class EasyProblem {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		int n = Integer.valueOf(rd.readLine());
		String[] inpStr = rd.readLine().split("\\s");


		for(String s : inpStr){
			if(s.equals("1")){
				wr.println("HARD");
				return;
			}
		}

		wr.println("EASY");

	}
}