import java.io.*;
import java.util.*;

public class CopyCopy {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			//Taking input.
			int n = Integer.parseInt(rd.readLine());
			int uniqNum = GetIntArray();

			wr.println(uniqNum);
		}

	}

	private static int GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		Set<Integer> resArray = new HashSet<Integer>();
		for(int i = 0; i < inpstr.length; i++){
			resArray.add(Integer.valueOf(inpstr[i]));
		}

		return resArray.size();
	}

	private static void PrintArr(int[] array){
		for(int i : array){
			wr.print(i + " ");
		}
		wr.println();
	}
}