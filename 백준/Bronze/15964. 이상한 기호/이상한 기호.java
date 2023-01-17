import java.util.*;

public class Main {
	static int cal(int A, int B) {
		return (A+B)*(A-B);
	}
	
	public static void main(String[] args) {
		Main cal = new Main();
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = Main.cal(num1, num2);
		
		System.out.println(result);
		
		sc.close();
	}
	
}