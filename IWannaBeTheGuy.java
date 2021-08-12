import java.io.*;
import java.util.*;

public class IWannaBeTheGuy {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(rd.readLine());
		ArrayList<Integer> littleX = GetIntArray();
		ArrayList<Integer> littleY = GetIntArray();

		int lenX = littleX.remove(0);
		int lenY = littleY.remove(0);

		//printing the arrays.
		Collections.sort(littleX);
		Collections.sort(littleY);

		if(lenX + lenY < n){
			wr.println("Oh, my keyboard!");
			return;
		}

		for(int i = 1; i <= n; i++){
			if(littleX.indexOf(i) == -1){
				if(littleY.indexOf(i) == -1){
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

	private static ArrayList<Integer> GetIntArray() throws IOException{
		String[] inpstr = rd.readLine().split("\\s");
		ArrayList<Integer> resArray = new ArrayList<Integer>();
		for(String i : inpstr){
			resArray.add(Integer.parseInt(i));
		}

		return resArray;
	}
	
}