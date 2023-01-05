import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			
			String sf = String.valueOf(s.charAt(0));
			String sb = String.valueOf(s.charAt(s.length()-1));
			System.out.print(sf+sb+"\n");
		}
		
		sc.close();
		
	}
}