import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int res = 0;
		
        
		for(int i = 0; i< String.valueOf(T).length(); i++) {
        	res += String.valueOf(T).charAt(i) - '0' ;
		}
        System.out.println(res);
	}
}