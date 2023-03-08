import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception 	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int i=0; i<T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a>b) {
            	System.out.println("#"+(i+1)+" >");
            } else if(a<b) {
            	System.out.println("#"+(i+1)+" <");
            } else {
            	System.out.println("#"+(i+1)+" =");
            }
        }
	}
}