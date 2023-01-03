import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T, A, B;
		int [][] arr;
		
		T = scan.nextInt();
		arr = new int [T][2];
		
		for(int i=0; i<T; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			
			arr[i][0] = A;
			arr[i][1] = B;
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(arr[i][0]+arr[i][1]);
		}
			
	}	
}
