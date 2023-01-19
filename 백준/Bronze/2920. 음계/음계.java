import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		sc.close();
		
		for(int i=0; i<arr.length-1; i++) {	//arr인덱스0~6까지
			if(arr[i] == arr[i+1] - 1) {	//두 값의 차가 -1이면
				result = "ascending";
			} else if(arr[i] == arr[i+1] + 1) {	//두 값의 차가 1이면
				result = "descending";
			} else {		//둘 다 아니면
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
	}
}