import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();	//테스트 케이스의 개수
		
		for(int i=0; i<num; i++) {	//테스트 케이스의 개수만큼 문자열 입력 받음
			String str = sc.next();
			int sum = 0;
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {	//문자열에서 문자 하나씩
				char ch = str.charAt(j);
				
				if(ch == 'O') {	//문자가 O이면 count에 1 증가 후 sum에 저장
					count += 1;
					sum += count;
				} else {		//O가 아니면 count를 0으로 초기화 합계에 저장 안함
					count = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();	
	}
}