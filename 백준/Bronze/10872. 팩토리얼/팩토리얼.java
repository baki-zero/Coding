import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, result=1;

		N = scan.nextInt();

		for(int i = N; i>=1; i--) {
			result = result*i;
		}
		System.out.println(result);
	}
}
