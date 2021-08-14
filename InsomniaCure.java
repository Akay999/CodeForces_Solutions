import java.io.*;
import java.util.*;

public class InsomniaCure {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int arr[] = new int[4];
		arr[0] = Integer.parseInt(rd.readLine());
		arr[1] = Integer.parseInt(rd.readLine());
		arr[2] = Integer.parseInt(rd.readLine());
		arr[3] = Integer.parseInt(rd.readLine());
		int d = Integer.parseInt(rd.readLine()), sum = 0;
		
		for(int i = 0; i < 4; i++){
			sum += d / arr[i];
			for(int j = i + 1; j < 4; j++){
				sum -= d / lcm(Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j]));
			}
		}

		wr.println(sum);

	}

	static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }

	static int gcd(int a, int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
	
}