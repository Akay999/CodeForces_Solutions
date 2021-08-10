import java.io.*;

public class Magnets {
	public static void main(String[] args) throws IOException{
		PrintWriter wr = new PrintWriter(System.out, true);
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		//INput Number of magnets
		int numMagnets = Integer.valueOf(rd.readLine());

		String curPosition = rd.readLine(), newPosition;
		// tracking number of groups.
		int count = 1;



		for(int i = 1; i < numMagnets; i++){
			newPosition = rd.readLine();
			if(!newPosition.equals(curPosition)){
				curPosition = newPosition;
				count++;
			}
		}

		wr.println(count);
	}
}