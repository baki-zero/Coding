# [level 0] 배열 자르기 - 120833 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120833) 

### 성능 요약

메모리: 82.2 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>정수 배열 <code>numbers</code>와 정수 <code>num1</code>, <code>num2</code>가 매개변수로 주어질 때, <code>numbers</code>의 <code>num1</code>번 째 인덱스부터 <code>num2</code>번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>2 ≤ <code>numbers</code>의 길이 ≤ 30</li>
<li>0 ≤ <code>numbers</code>의 원소 ≤ 1,000</li>
<li>0 ≤<code>num1</code> &lt; <code>num2</code> &lt; <code>numbers</code>의 길이</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>num1</th>
<th>num2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3, 4, 5]</td>
<td>1</td>
<td>3</td>
<td>[2, 3, 4]</td>
</tr>
<tr>
<td>[1, 3, 5]</td>
<td>1</td>
<td>2</td>
<td>[3, 5]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>[1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>[1, 3, 5]의 1번째 인덱스 3부터 2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이 1 ( Arrays.copyofRange() 사용 )

```
import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers, num1, (num2 + 1));
    
        return answer;
    }
}
```
Arrays.copyofRange() 메소드를 사용해 해결했다.

첫번째 인자에 배열을 넣고, 두번째 인자에는 시작 값, 마지막 인자에는 마지막 값의 +1을 한다.

그러면 시작 값에 입력한 num1의 값인 인덱스부터 num2+1의 값의 인덱스에 해당하는 배열의 값이

answer 배열에 들어가게 되고 이를 반환하면 풀리는 문제이다.


## 풀이 2 (for 반복문 사용)

```
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {

        int[] answer = new int [num2-num1+1];
		
		int index = 0;
		for(int i = num1; i<=num2; i++) {
			answer[index] = numbers[i];
			index++;
		}
        
        return answer;
    }
}
```

내가 풀다가 시도했던 풀이와 비슷하지만 성공한 풀이코드이다.

이중 for문이 아닌 index를 0으로 초기화하고 ++연산을 수행하면서 answer배열에 값을 채워넣는다.

하나배워갑니당..


## 번외 (내가 실패한 풀이)

```
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int [num2-num1+1];
        
        for(int j=0; j<answer.length; j++) {
            for(int i=num1; i<=num2; i++) {
                answer[j] = numbers[i];
            }
        }
        return answer;
    }
        
        
}
```

for문을 두번 사용해서 해결해보려고 했다.

answer에 num1부터 num2까지의 길이만큼을 주고

for문의 j에 그 길이만큼 반복하면서 numbers의 인덱스 i=num1부터 num2까지의 값을 answer에 넣으려고 했는데

오류가 발생했다.

위의 풀이 1, 2에 비해 길이도 길고 반복문을 두번 사용하기 때문에 만약 컴파일에 성공했더라도 수행시간도 길어졌을 것으로 판단된다.
