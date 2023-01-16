import java.util.*;	//Date, TimeZone 사용
//import java.io.*;
import java.text.*;	//DateFormat, SimpleDateFormat 사용

class Main {
	public static void main(String[] args) {
		Date date = new Date();		//Date클래스로 현재 시간 가져옴
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd");	//형식 지정
		df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));	//채점 서버의 시간대 UTC+0이므로 서울의 날짜 출력 위해 TimeZone 설정
		System.out.print(df.format(date));
		
	}	
	
}