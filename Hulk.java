import java.io.*;

public class Hulk {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		// int testCases = Integer.valueOf(rd.readLine());

		// while(testCases-- > 0){
		// 	// solve()
		// }

		int n = Integer.valueOf(rd.readLine());
		String resString = "";

		for(int i = 1; i <= n; i++){
			resString += "I ";
			if(i % 2 == 0){
				resString += "love ";
			}
			else
				resString += "hate ";

			if(i == n)
				resString += "it";
			else
				resString += "that ";
		}

		wr.println(resString);

	}

	private static int[] GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		int[] resArray = new int[inpstr.length];
		for(int i = 0; i < inpstr.length; i++){
			resArray[i] = Integer.valueOf(inpstr[i]);
		}

		return resArray;
	}

	private static void PrintArr(int[] array){
		for(int i : array){
			wr.print(i + " ");
		}
		wr.println();
	}
}