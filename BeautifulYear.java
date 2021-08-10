import java.io.*;

public class BeautifulYear {
	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

		int initYear = Integer.valueOf(rd.readLine()), temp, arrayCounter;
		int[] digitArray = new int[4];

		boolean isBeautiful = true;

		do {
			isBeautiful = true;
			initYear++;
			temp = initYear;
			arrayCounter = 0;
			while(temp != 0){
				int digit = temp % 10;
				temp /= 10;
				digitArray[arrayCounter] = digit;
				arrayCounter++;
			}

			// Comparing the Digits.
			for(int i = 0; i < 3; i++){
				for(int j = i + 1; j < 4; j++){
					if(digitArray[i] == digitArray[j])
						isBeautiful = false;
				}
			}
		}while(!isBeautiful);

		System.out.println(initYear);

	}
}