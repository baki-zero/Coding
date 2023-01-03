import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{						//예외처리
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	//선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
		
		int N = Integer.parseInt(br.readLine());
	
		//데이터 가공(StringTokenizer 사용)
		StringTokenizer st;				
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}