import java.io.*;

public class Presents {
	public static void main(String[] args) throws IOException{
		PrintWriter wr = new PrintWriter(System.out, true);
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		//qunatity of friends petya invited.
		int n = Integer.valueOf(rd.readLine());

		String[] inpstr = rd.readLine().split("\\s");

		int resArray[] = new int[inpstr.length];

		for(int i = 1; i <= inpstr.length; i++){
			int person = Integer.valueOf(inpstr[i - 1]);
			resArray[person - 1] = i;
		}

		for(var i : resArray){
			wr.print(i + " ");
		}
		wr.println();
	}
}