import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {	//값이 없을 때까지 반복
			String s = sc.nextLine();
			System.out.println(s);
		}
		
		sc.close();
	}	
	
}