import java.io.*;
import java.util.*;

public class RestorePermutation {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);
	private static ArrayList<Integer> resArray = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// taking input.
			int n = Integer.parseInt(rd.readLine());
			GetIntArray();
			int[] initPer = new int[resArray.size() / 2];
			for(int i = 0; i < n; i++){
				int curElement = resArray.get(0);
				initPer[i] = curElement;
				resArray.remove(0);
				resArray.remove(resArray.indexOf(curElement));
			}

			PrintArr(initPer);
		}

	}

	private static void GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		for(String i : inpstr){
			resArray.add(Integer.parseInt(i));
		}
	}

	private static void PrintArr(int[] array){
		for(int i : array){
			wr.print(i + " ");
		}
		wr.println();
	}
}