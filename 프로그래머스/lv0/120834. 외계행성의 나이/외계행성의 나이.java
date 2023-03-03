class Solution {
    public String solution(int age) {
        String alphabet = "abcdefghij";
        String answer = "";
        
        if(age < 10) {
            answer = String.valueOf(alphabet.charAt(age));
        } else if(age < 100) {
            answer = String.valueOf(alphabet.charAt(age/10));
            answer += String.valueOf(alphabet.charAt(age%10));
        } else if(age < 1000) {
            answer = String.valueOf(alphabet.charAt(age/100));
            age = age%100;
            answer += String.valueOf(alphabet.charAt(age/10));
            age = age%10;
            answer += String.valueOf(alphabet.charAt(age));
        } else if(age == 1000) {
            answer = "baaa";
        }
        
        return answer;
    }
}