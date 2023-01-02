import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner SCANNUM = new Scanner(System.in);
		int num1, num2;
		
		//System.out.print("A와 B 값을 입력하세요 (0<A, B<10) : ");
		num1 = SCANNUM.nextInt();
		num2 = SCANNUM.nextInt();
		
		System.out.println(num1+num2);
	}

}
