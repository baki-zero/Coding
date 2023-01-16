import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int alphabet[] = new int[26];
		
		for(int i=0; i<26; i++) {	//a~z만큼의 크기의 배열에 -1값 입력
			alphabet[i] = -1;
		}
		
		for(int j=0; j<s.length(); j++) {	//사용자에게 입력받은 단어의 길이만큼 반복
			int ch = (int)s.charAt(j);		//사용자에게 입력받은 단어 중 한글자씩 ch에 입력
			
			if(alphabet[ch-97] == -1) {		//ch에서 소문자 a값만큼 뺀 곳의 값이 -1이면
				alphabet[ch-97] = j;		//ch에서 소문자 a값만큼 빼면 ch의 위치파악 가능
			}
		}
		
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
		
		
		sc.close();
	}	
	
}