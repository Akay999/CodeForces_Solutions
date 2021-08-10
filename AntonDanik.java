import java.io.*;

public class AntonDanik {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out, true);

		int n = Integer.valueOf(rd.readLine());
		String inputstr = rd.readLine();

		int Acount = 0, Dcount = 0;

		for(int i = 0; i < n; i++){
			if(inputstr.charAt(i) == 'A')
				Acount++;
			else
				Dcount++;
		}

		if(Acount > Dcount)
			wr.println("Anton");
		else if(Acount < Dcount)
			wr.println("Danik");
		else
			wr.println("Friendship");
	}
}