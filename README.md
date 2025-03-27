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
        bw.close();
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
4. [Heap](./Java_Code/src/Algorithm_data_structure/md_file/Heap.md)
5. [Queue](./Java_Code/src/Algorithm_data_structure/md_file/Queue.md)
5. [PriorityQueue,Brute Force(완전탐색)](./Java_Code/src/Algorithm_data_structure/md_file/PriorityQueue.md)
6. [**Deque(중요)**](./Java_Code/src/Algorithm_data_structure/md_file/Deque.md)
7. [Hashmap](./Java_Code/src/Algorithm_data_structure/md_file/Hashmap.md)
8. [String문자열활용](./Java_Code/src/Algorithm_data_structure/md_file/String.md)

#### 중급
1. [BinarySearch](./Java_Code/src/Algorithm_data_structure/md_file/BinarySearch.md)
2. [DFS](./Java_Code/src/Algorithm_data_structure/md_file/DFS.md)
3. [BFS](./Java_Code/src/Algorithm_data_structure/md_file/BFS.md)
4. [Recursion](./Java_Code/src/Algorithm_data_structure/md_file/Recursion.md)

#### 심화
1. [Graph](./Java_Code/src/Algorithm_data_structure/md_file/Graph.md)
2. [DP(Dynamic_Programming)](./Java_Code/src/Algorithm_data_structure/md_file/DP.md)