import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float iMax = 0;
		float sum = 0;
		int scores[] = new int[N];
		
		for(int i=0; i<N; i++) {
			scores[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i : scores) iMax = Math.max(i, iMax);

		for(int i=0; i<N; i++) {
			sum += scores[i]/iMax*100;
		}
		float average = sum/N;
		
		System.out.print(average);
	}
}