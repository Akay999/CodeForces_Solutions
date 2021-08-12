import java.io.*;

public class FairDivision {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);
	private static int Sum = 0;
	private static int ones = 0;

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// Getting inputs.
			int n = Integer.parseInt(rd.readLine());
			int[] candiW = GetIntArray();
			if(Sum % 2 != 0){
				wr.println("NO");
			}
			else {
				if((Sum / 2) % 2 == 0){
					wr.println("YES");
				}
				else{
					if(ones > 0)
						wr.println("YES");
					else
						wr.println("NO");

				}
			}
		}

	}

	private static int[] GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		int[] resArray = new int[inpstr.length];
		Sum = 0;
		ones = 0;
		for(int i = 0; i < inpstr.length; i++){
			resArray[i] = Integer.valueOf(inpstr[i]);
			Sum += resArray[i];
			if(resArray[i] == 1)
				ones++;
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