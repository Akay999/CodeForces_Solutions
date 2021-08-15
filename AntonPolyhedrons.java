import java.io.*;

public class AntonPolyhedrons {
	private static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter wr = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(rd.readLine());

		int sumFaces = 0;

		for(int i = 0; i < n; i++){
			String curName = rd.readLine();
			switch(curName) {
				case "Tetrahedron" :
					sumFaces += 4;
					break;

				case "Cube" :
					sumFaces += 6;
					break;

				case "Octahedron" :
					sumFaces += 8;
					break;

				case "Dodecahedron" :
					sumFaces += 12;
					break;

				case "Icosahedron" :
					sumFaces += 20;
					break;
			}
		}

		wr.println(sumFaces);
	}
	
}