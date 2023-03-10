# [level 0] 분수의 덧셈 - 120808 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120808?language=java) 

### 성능 요약

메모리: 79.5 MB, 시간: 0.16 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>첫 번째 분수의 분자와 분모를 뜻하는 <code>numer1</code>, <code>denom1</code>, 두 번째 분수의 분자와 분모를 뜻하는 <code>numer2</code>, <code>denom2</code>가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt;<code>numer1</code>, <code>denom1</code>,&nbsp;<code>numer2</code>, <code>denom2</code> &lt; 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numer1</th>
<th>denom1</th>
<th>numer2</th>
<th>denom2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>1</td>
<td>2</td>
<td>3</td>
<td>4</td>
<td>[5, 4]</td>
</tr>
<tr>
<td>9</td>
<td>2</td>
<td>1</td>
<td>3</td>
<td>[29, 6]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges


## 풀이 1

```
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1 * denom2;
        
        for(int i = numer; i>1; i--) {
            if((numer%i == 0) && (denom%i == 0)) {
                numer /= i;
                denom /= i;
            }
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
}
```

우리가 분수 덧셈을 푸는 것처럼

두 분모를 곱해서 같도록 만들고 각 분자에 값을 곱하고 합하여 분자를 구했다.

그리고 분자부터 2까지 i값을 감소시키면서

분자, 분모를 나눠 둘의 나머지 값이 0일 때 (분자, 분모가 같은 수로 나눠지는지 확인)

해당 i 값으로 분자, 분모를 나눈 후 다시 numer과 denom에 저장한다.


## 풀이 2

```
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1 * denom2;
        
        int div = gcd(numer, denom);
        answer[0] = numer/div;
        answer[1] = denom/div;
        
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        if( num1 <= num2 ) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num2 == 0) {
            return num1;
        }
        return gcd(num2, (num1 % num2));
    }
}
```

answer 배열에 분자, 분모의 값만 저장할 것이기 때문에 크기를 2로 만든다.

두 분모의 값을 곱하고 각각의 분자에도 값을 곱한 후 더한다.

여기까지 풀이 1과 같다.

그 다음 gcd라는 함수를 만들어준다.

gcd(a, b)라고 놓고 봤을 때,

두 양의 정수 a, b (a > b) 에 대하여 a = bq + r (0 ≤ r < b) 이라 하면, a, b의 최대공약수는 b, r의 최대공약수와 같다.

즉, gcd(a, b) = gcd(b, r)이 된다.

여기서 만약, r=0이라면 최대공약수는 b가 된다.
