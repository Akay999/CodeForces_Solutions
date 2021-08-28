import java.io.*;

public class FoxAndSnakes {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		String[] inpStr = rd.readLine().split("\\s");

		int n = Integer.parseInt(inpStr[0]);
		int m = Integer.parseInt(inpStr[1]);

		// char[][] resMatrix = new char[n][m];

		int oddEven = 0;

		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				for(int j = 0; j < m; j++){
					System.out.print("#");
				}				
			}
			else{
				if(oddEven % 2 == 0){
					for(int j = 0; j < m - 1; j++){
						System.out.print(".");
					}
					System.out.print("#");
				}
				else {
					System.out.print("#");
					for(int j = 1; j < m; j++){
						System.out.print(".");
					}
				}

				oddEven++;
			}

			System.out.println();

		}

	}
	
}