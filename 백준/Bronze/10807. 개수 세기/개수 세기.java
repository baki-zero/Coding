import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int count = 0;
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}	
		
		int v = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			if (arr[i]==v) {
				count += 1;
			}
		}
		System.out.print(count);
	}
}
