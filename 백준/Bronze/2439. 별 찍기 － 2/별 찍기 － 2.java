import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {	//5줄(1~5줄)
			for(int j=1; j<=N-i; j++) {	//공백을 하나부터 N-i개 출력
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {	//별을 줄의 수만큼 출력(1줄에 별 하나 출력)
				System.out.print("*");
				
			}
			System.out.println("");		//개행
		}
		
		sc.close();	
	}
}