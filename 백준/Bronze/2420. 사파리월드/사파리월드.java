import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N, M, result;

		N = scan.nextLong();
		M = scan.nextLong();

		result = N-M;
		if(result < 0) {
			System.out.println(result*(-1));
		} else {
			System.out.println(result);
		}
	}
}
