import java.io.*;

public class GiftsFixing {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// taking input.
			int n = Integer.parseInt(rd.readLine());
			long[] candies = GetIntArray();
			long[] oranges = GetIntArray();
			long minCandies = getMin(candies);
			long minOranges = getMin(oranges);

			long sum = 0;
			// long operCandies, operOranges;
			for(int i = 0; i < n; i++){
				long operCandies = candies[i] - minCandies;
				long operOranges = oranges[i] - minOranges;

				long temp = Math.min(operOranges, operCandies);
				sum += temp + Math.max(operOranges, operCandies) - temp;
			}

			wr.println(sum);
		}

	}

	private static long getMin(long[] arr){
		long curMin = Long.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < curMin)
				curMin = arr[i];
		}

		return curMin;
	}

	private static long[] GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		long[] resArray = new long[inpstr.length];
		for(int i = 0; i < inpstr.length; i++){
			resArray[i] = Long.parseLong(inpstr[i]);
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