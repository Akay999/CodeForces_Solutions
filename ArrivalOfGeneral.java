import java.io.*;

public class ArrivalOfGeneral {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(rd.readLine());
		int heights[] = GetIntArray();

		int i, j, len = heights.length;
		int curMax = Integer.MIN_VALUE, curMin = Integer.MAX_VALUE, maxPtr = 0 , minPtr = len - 1;
		for(i = 0, j = len - 1; i < len && j >= 0; i++, j--){
			// checking the current max and their index.
			if(heights[i] > curMax){
				curMax = heights[i];
				maxPtr = i;
			}

			//checking the current min and their index.
			if(heights[j] < curMin){
				curMin = heights[j];
				minPtr = j;
			}

		}


		if(minPtr < maxPtr)
			wr.println((len - 1 - minPtr) + maxPtr - 1);
		else 
			wr.println((len - 1 - minPtr) + maxPtr);

	}
	
	private static int[] GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		int[] resArray = new int[inpstr.length];
		for(int i = 0; i < inpstr.length; i++){
			resArray[i] = Integer.valueOf(inpstr[i]);
		}

		return resArray;
	}
}