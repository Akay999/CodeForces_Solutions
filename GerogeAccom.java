import java.io.*;

public class GerogeAccom {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		//taking input;
		//number of rooms.
		int numRooms = Integer.valueOf(rd.readLine());

		//tracking number of rooms available.
		int count = 0;

		for(int i = 0; i < numRooms; i++){
			String arr[] = rd.readLine().split("\\s");
			int pi = Integer.valueOf(arr[0]) , qi = Integer.valueOf(arr[1]);
			if(qi - pi >= 2)
				count++;
		}

		wr.println(count);
	}
}