import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int res = A*B*C;
		String str = Integer.toString(res);
		sc.close();	

		for(int i=0; i<10; i++) {		//0~9 반복해서 비교
			int count = 0;				//해당 숫자가 몇 번 있는지 카운트할 count 변수
			for(int j=0; j<str.length(); j++) {	//연산결과길이만큼
				int ch = str.charAt(j);		//연산결과를 한글자씩 받아옴
				if(ch - '0' == i) {			//문자에서 0을 빼 숫자로 연산
					count++;
				}	
			}
			System.out.println(count);
		}
	}
}