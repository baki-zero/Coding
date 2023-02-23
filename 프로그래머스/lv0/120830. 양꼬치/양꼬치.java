class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        for(int i=0; i<=1000; i+=10) {
            if((n/10 >= i)) {
                answer = 12000*n + 2000*(k-(n/10));
            } 
        }
   
        return answer;
    }
}