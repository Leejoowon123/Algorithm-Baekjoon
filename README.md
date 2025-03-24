# Algorithm-Baekjoon

## 기초부터 다시 시작하는 코딩 공부

### 단축키
- **자동 완성**: Ctrl + o 
        e.g. Syso -> System.out.println();
- **자동 Import**: Shift + alt + o

#### **[Java 기본 입출력]**

<details>
<summary>접어두기</summary>

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        br.close();
        bw.flush();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
```
</details>

### 앞으로 공부 순서
자료구조 -> 알고리즘 -> 빡구현

#### 기본
1. [Stack](./Java_Code/src/Algorithm_stack/README.md)
2. Queue
3. PriorityQueue, 완전 탐색
4. Deque(중요)
5. Hashmap
6. String 문자열 활용
7. Union-Find

#### 중급
1. BinarySearch
2. DFS
3. BFS
4. Recursion

#### 심화
1. Graph
2. DP(Dynamic Programming)
