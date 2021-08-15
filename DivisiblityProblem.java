import java.io.*;

public class DivisiblityProblem {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// Taking input.
			int inputs[] = GetIntArray();

			if(inputs[0] < inputs[1]){
				wr.println(inputs[1] - inputs[0]);
				continue;
			}

			int rem = inputs[0] % inputs[1];
			if(rem == 0){
				wr.println(rem + " ");
			}
			else{
				wr.println(inputs[1] - rem);
			}
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