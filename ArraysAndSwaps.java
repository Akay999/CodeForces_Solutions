import java.io.*;
import java.util.Arrays;

public class ArraysAndSwaps {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		//Taking number of test cases.
		int testCases = Integer.valueOf(rd.readLine());

		for(int i = 0; i < testCases; i++){
			String arr[] = rd.readLine().split("\\s");
			int n = Integer.valueOf(arr[0]);
			int k = Integer.valueOf(arr[1]);
			int arrA[] = getIntgerArr(rd.readLine().split("\\s"));
			int arrB[] = getIntgerArr(rd.readLine().split("\\s"));

			wr.println(getMaxSum(arrA, arrB, k));
 		}
	}
	
	private static int getMaxSum(int[] arr1, int[] arr2, int k){
		//Sorting the arrays.
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int ltPtr = 0, rtPtr = arr1.length - 1;

		while(k > 0 && (arr1[ltPtr] < arr2[rtPtr])){
			k--;
			int temp = arr1[ltPtr];
			arr1[ltPtr] = arr2[rtPtr];
			arr2[rtPtr] = temp;
			ltPtr++;
			rtPtr--;
		}

		int sum = 0;
		for(int i : arr1){
			sum += i;
		}

		return sum;
	}

	private static int[] getIntgerArr(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			res[i] = Integer.valueOf(arr[i]);
		}
		return res;
	}
}