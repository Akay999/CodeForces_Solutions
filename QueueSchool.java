import java.io.*;

public class QueueSchool {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter  wr = new PrintWriter(System.out, true);

		//declaring time and number variable.
		int n, t;
		String queue, newQueue = "";

		var arr = (rd.readLine().split("\\s"));
		if(arr.length != 2){
			wr.println("Error");
			return;			
		}
		else {
			n = Integer.valueOf(arr[0]);
			t = Integer.valueOf(arr[1]);
			queue = rd.readLine();
		}

		for(int i = 0; i < t; i++){
			newQueue = "";
			for(int j = 0; j < queue.length(); j++){
				if(queue.charAt(j) == 'B' && j + 1 < queue.length() && queue.charAt(j + 1) == 'G' ){
					newQueue += "GB";
					j++;
				}
				else {
					newQueue += queue.charAt(j);
				}
			}

			queue = newQueue;
		}

		wr.println(newQueue);
		
	}
}