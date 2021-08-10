import java.io.*;

public class VanyaFence {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		//taking the input 1st int is number of friends and second input is height of the fence.
		String[] inpstr = rd.readLine().split("\\s");

		//converting string to integers.
		int numFri = Integer.valueOf(inpstr[0]);
		int height = Integer.valueOf(inpstr[1]);

		//taking the heights array.
		inpstr = rd.readLine().split("\\s");

		//tracking the heights grater than fence height.
		int graterH = 0;

		for(int i = 0; i < numFri; i++){
			int temp = Integer.valueOf(inpstr[i]);
			if(temp > height)
				graterH++;

		}

		int sum = (numFri - graterH) + (2 * graterH);
		wr.println(sum);
	}
}