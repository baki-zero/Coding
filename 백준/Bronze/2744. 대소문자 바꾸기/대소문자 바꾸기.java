import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String result = "";
		
		for(int i=0; i<s.length(); i++) {
			
			int ch = (int)s.charAt(i);
			
			if( (ch>=65) && (ch<=90) ) {		 // 대문자인 경우
				result += (char)(ch + 32);		 // 아스키 코드 값 32를 더해 소문자로 바꿈	
			} else if( (ch>=97) && (ch<=122) ) { // 소문자인 경우
				result += (char)(ch - 32);		 // 아스키 코드 값 32를 빼 대문자로 바꿈
			} else {							 // 다른 문자는 그대로 저장
				result += (char)ch;
			}
		}
		System.out.print(result);
		
		sc.close();
		
	}
}