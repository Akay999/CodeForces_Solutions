import java.io.*;

public class Games {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{

		int n = Integer.parseInt(rd.readLine());
		int uniArr[][] = new int[n][2];

		for(int i = 0; i < n; i++){
			String inpstr[] = rd.readLine().split("\\s");

			uniArr[i][0] = Integer.parseInt(inpstr[0]);
			uniArr[i][1] = Integer.parseInt(inpstr[1]);
		}

		int sum = 0;

		for(int i = 0; i < n; i++){
			int curColor = uniArr[i][0];
			for(int j = 0; j < n; j++){
				if(i == j)
					continue;
				if(uniArr[j][1] == curColor){
					sum++;
				}
			}
		}

		wr.println(sum);
		
	}
	
}