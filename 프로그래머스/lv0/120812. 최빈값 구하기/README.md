# [level 0] 최빈값 구하기 - 120812 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120812) 

### 성능 요약

메모리: 73.6 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 <code>array</code>가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt; <code>array</code>의 길이 &lt; 100</li>
<li>0&nbsp;≤&nbsp;<code>array</code>의 원소 &lt; 1000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>array</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3, 3, 3, 4]</td>
<td>3</td>
</tr>
<tr>
<td>[1, 1, 2, 2]</td>
<td>-1</td>
</tr>
<tr>
<td>[1]</td>
<td>1</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>[1]에는 1만 있으므로 최빈값은 1입니다.</li>
</ul>

<hr>

<p>※ 공지 - 2022년 10월 17일 제한 사항 및 테스트케이스가 수정되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges


## 풀이

```
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
```

최빈값이란 주어진 데이터 중 가장 많이 중복된 값을 말한다.

제한사항에서 보는 것과 같이 array의 원소의 범위는 0~1000이므로

count라는 배열을 만들어 1~1000의 범위를 지정해준다.

for문을 이용해 입력받은 array 배열의 값에 해당하는 count 배열의 인덱스 값을 증가시킨다.

이때 if문을 이용하여 해당 배열의 값이 max 보다 크면 그 값을 max에 넣고 최빈값으로 지정한다.

이후 계속해서 for문을 돌면서 최빈값이 갱신된다.

만약, 최빈값이 여러개인 경우에는 아래 temp 변수를 이용해

for문을 돌면서 최빈값이 두 개 이상인 경우를 찾고 answer이 -1을 리턴하도록 한다.
