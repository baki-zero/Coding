import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num1, num2;

		num1 = scan.nextLong();
		num2 = scan.nextLong();

		if(num1>num2) {
			System.out.println(">");
		} else if(num1<num2) {
			System.out.println("<");	
		} else {
			System.out.println("==");
		}
	}

}
