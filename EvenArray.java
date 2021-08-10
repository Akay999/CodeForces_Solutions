import java.io.*;

public class EvenArray {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// Takign input
			int length = Integer.parseInt(rd.readLine());
			int[] inpArray = GetIntArray();

			int result = solve(inpArray, length);
			wr.println(result);
		}

	}

	private static int solve(int[] testArr, int n){
		int evenImpaired = 0, oddImpaired = 0;
		int mod;
		for(int i = 0; i < n; i++){
			if( (mod = i % 2) != testArr[i] % 2){
				if(mod == 1)
					oddImpaired++;
				else
					evenImpaired++;
			}
		}

		if(evenImpaired == oddImpaired)
			return evenImpaired;
		else
			return -1;
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