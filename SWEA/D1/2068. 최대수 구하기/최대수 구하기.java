import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] arr = new int [10];
        int max = 0;
        
		for(int i=0; i<T; i++) {
            max = 0;
			for(int j=0; j<10; j++) {
                arr[j] = sc.nextInt();
                if(arr[j] > max) {
                    max = arr[j];
                }
        	}
            System.out.println("#"+(i+1)+" "+ max);
       
		}
        
	}
}