import java.io.*;

public class OrdinaryNumber {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		//FOR GETTING THE TEST CASES
		int testCases = Integer.valueOf(rd.readLine());

		while(testCases-- > 0){
			// Taking Input.
			String inpNum = rd.readLine();
			if(inpNum.length() == 1){
				wr.println(inpNum);
			}
			else{
				int len = inpNum.length();
				String mckNum = "";
				String inpDigit = inpNum.charAt(0) + "";
				for(int i = 0; i < len; i++){
					mckNum += inpDigit;
				}
				int intNum = Integer.parseInt(inpNum);
				int intmck = Integer.parseInt(mckNum);

				int ans = Integer.parseInt(inpDigit);

				if(intmck <= intNum){
					ans += 9 * (len - 1);
					wr.println(ans);
				}
				else {
					ans = (ans - 1) + (9 * (len - 1));
					wr.println(ans);
				}
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