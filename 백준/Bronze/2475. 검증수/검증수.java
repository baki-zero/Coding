import java.util.*;

public class Main {
	static double check(int num[]) {
		double cal = 0;
		for(int i=0; i<5; i++) {
			cal += Math.pow(num[i], 2);
		}
		double six = cal%10;
		return six;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input[] = new int[6];
		
		for(int i=0; i<5; i++) {
			input[i] = sc.nextInt();
		}

		input[5] = (int)check(input);
		
		System.out.println(input[5]);
		
		sc.close();
	}
	
}