import java.io.*;

public class BalancedArray {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int testCases = Integer.valueOf(rd.readLine());

		for(int i = 0; i < testCases; i++){
			int n = Integer.valueOf(rd.readLine());
			GetArray(n);
		}
	}

	private static void GetArray(int n){
		//checking for the possibility.
		if(n/2 % 2 != 0){
			wr.println("NO");
			return;
		}

		int[] resArray = new int[n];
		int start = 0, end = n / 2, ticker = 1;
		for(int i = 0; i < n / 4; start += 2, end += 2, i++){
			ticker = fillPair(resArray, start, end, ticker);
		}

		wr.println("YES");
		for(int i : resArray){
			wr.print(i + " ");
		}
		wr.println();

	}

	private static int fillPair(int[] arr, int leftPtr, int rightPtr, int ticker){
		if(ticker % 2 == 0){
			arr[leftPtr] = ticker;
			arr[leftPtr + 1] = ticker + 4;
			arr[rightPtr] = ticker + 1;
			arr[rightPtr + 1] = ticker + 3;
			return ticker + 5;
		}
		else {
			arr[rightPtr] = ticker;
			arr[rightPtr + 1] = ticker + 4;
			arr[leftPtr] = ticker + 1;
			arr[leftPtr + 1] = ticker + 3;
			return ticker + 5;

		}
	}
}