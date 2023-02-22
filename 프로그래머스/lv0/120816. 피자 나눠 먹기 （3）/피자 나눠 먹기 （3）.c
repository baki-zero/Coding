#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    
    for(int i=1; i<100; i++) {
        if(((slice*i)%n == 0)) {
            answer = i;
            break;
        } else if((slice*i) > n) {
            answer = i;
            break;
        }
    }
    
    return answer;
}