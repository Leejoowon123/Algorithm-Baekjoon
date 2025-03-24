# Algorithm-Baekjoon

## 기초부터 다시 시작하는 코딩 공부

### 단축키
- **자동 완성**: Ctrl + o 
        e.g. Syso -> System.out.println();
- **자동 Import**: Shift + alt + o

**[Java 기본 입출력]**

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