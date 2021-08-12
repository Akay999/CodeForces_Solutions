import java.io.*;
import java.util.*;

public class IWannaBeTheGuy {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(rd.readLine());
		int[] littleX = GetIntArray();
		int lenX = littleX[0];
		littleX = Arrays.copyOfRange(littleX, 1, lenX + 1);
		Arrays.sort(littleX);
		int[] littleY = GetIntArray();
		int lenY = littleY[0];
		littleX = Arrays.copyOfRange(littleX, 1, lenY + 1);
		Arrays.sort(littleY);

		if(lenX + lenY < n){
			wr.println("littleY is " + littleY[0] + "littleX is " + littleX[0]);
			wr.println("Oh, my keyboard!");
			return;
		}

		//printing the arrays.
		PrintArr(littleX);
		PrintArr(littleY);

		for(int i = 1, lptr = 0, rptr = 0; i <= n && lptr < lenX && rptr < lenY ; i++){
			if(littleY[rptr] == littleX[lptr]){
				if(i == littleX[lptr]){
					lptr++;
					rptr++;
				}
				else {
					wr.println("from i = " + i + "littleX = " + littleX[lptr] + "littleY = " + littleY[rptr] + " Oh, my keyboard! " + lptr + "  " + rptr);
					return;
				}
			}
			else{
				if(littleX[lptr] == i)
					lptr++;
				else if(littleY[rptr] == i)
					rptr++;
				else{
					wr.println("Oh, my keyboard!");
					return;
				}
			}
		}

		wr.println("I become the guy.");

		
	}

	private static void PrintArr(int[] array){
		for(int i : array){
			wr.print(i + " ");
		}
		wr.println();
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