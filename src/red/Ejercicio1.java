package red;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
		
		URL url;
		Scanner sc = null;
		try {
			url = new URL("ftp://cisco/apuntes/GBD/tablas_t11.sql");
			sc = new Scanner(url.openStream());
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
		}
		
		
	}

}
