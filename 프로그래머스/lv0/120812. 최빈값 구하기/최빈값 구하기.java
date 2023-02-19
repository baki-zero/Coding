class Solution {
    public int solution(int[] array) {
        int answer = 0; //최빈값
        int max = 0; 
        int count [] = new int[1000+1]; //값별 개수 카운트 배열
        
        for(int i=0; i<array.length; i++) {  //입력받은 배열의 해당하는 count 배열 값을 증가
            count[array[i]]++;
            if(max < count[array[i]]) {     //배열의 값이 max보다 크면 해당 값을 최빈값으로 지정
                max = count[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0;   //최빈값이 두개이상인 경우에는 -1 리턴
        for(int j=0; j<1001; j++) {
            if(max == count[j])
                temp ++;
            if (temp > 1)
                answer = -1;
        }
        
        return answer;
    }
}