import java.util.*;
//import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean arr[] = new boolean[31];	//총 학생 수 30명이지만 1부터 반복문을 돌릴거니까 +1
		
		for(int i=1; i<=28; i++) {			//숙제 제출한 학생 총 28명
			int input = scan.nextInt();		//숙제 제출한 학생 출석번호 입력
			arr[input] = true;				//해당 학생 배열 인덱스를 True로 설정
		}
		
		for(int j=1; j<=30; j++) {			//총 학생 30명
			if(!arr[j]) {					//배열(숙제제출학생)인덱스가 True가 아니면(False) 
				System.out.println(j);		//출력
			}
		}
		scan.close();
	}
}