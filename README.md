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
1. [Stack](./Java_Code/src/Algorithm_data_structure/md_file/Stack.md)
2. [Tree](./Java_Code/src/Algorithm_data_structure/md_file/Tree.md)
3. [Trie](./Java_Code/src/Algorithm_data_structure/md_file/Trie.md)
4. [Queue&Heap](./Java_Code/src/Algorithm_data_structure/md_file/Queue_Heap.md)
5. [PriorityQueue,완전탐색]
6. [**Deque(중요)**]
7. [Hashmap]
8. [String문자열활용]
9. [Union-Find]

#### 중급
1. BinarySearch
2. DFS
3. BFS
4. Recursion

#### 심화
1. Graph
2. DP(Dynamic Programming)
