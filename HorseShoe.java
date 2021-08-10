import java.io.*;
import java.util.*;

public class HorseShoe {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		// int testCases = Integer.valueOf(rd.readLine());

		// while(testCases-- > 0){
		// 	// solve()
		// }

		String inpstr[] = rd.readLine().split("\\s");
		Arrays.sort(inpstr);
		String cur = "";
		int count = 0;
		for(String i : inpstr){
			if(!i.equals(cur)){
				cur = i;
				count++;
			}
		}

		wr.println(4 - count);



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