import java.io.*;
import java.util.*;

public class HonestCoach {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// solve()
			//Getting number of athletes.
			int n = Integer.parseInt(rd.readLine());

			int[] inpArr = GetIntArray();
			Arrays.sort(inpArr);
			int minGap = Integer.MAX_VALUE;
			for(int i = 0; i < inpArr.length - 1; i++){
				int temp = Math.abs(inpArr[i] - inpArr[i + 1]);
				if(temp < minGap){
					minGap = temp;
				}
			}

			wr.println(minGap);
		}

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