# [자료구조] Priority Queue & Brute Force

## **Priority Queue란?**
- [Queue](./Queue.md): **FIFO**구조, 최솟값/최댓값을 빠르게 찾기 위해 **완전이진트리** 형태로 만들어진 자료 구조
- FIFO 구조인 Queue와 다르게 **우선 순위**가 가장 높은 데이터가 먼저 나옴
- **힙**을 이용하여 구현하는 것이 일반적
- 우선순위를 기준으로 **최대힙**, **최소힙**을 구성하고 데이터를 꺼낼 때, root node를 얻어냄<br>
[최소힙 문제](../../Heap_data_structure/Main_1927.java)<br>
[최대힙 문제](../../Heap_data_structure/Main_11279.java)<br>
※ **PriorityQueue를 그대로 사용** → 최소힙 문제<br>
※ **PriorityQueue에 Collections.reverseOrder()**를 사용 → 최대힙 문제<br>
- root node를 삭제할 때는 빈 루트 노드의 위치에 맨 마지막 노드를 삽입 -> 아래로 내려가면서 적절한 자리를 찾아서 옮김

### **Priority Queue 특징**
- 높은 우선순위의 요소를 먼저 꺼내서 처리(우선순위 큐에 들어가는 원소는 비교 가능한 기준이 있어야 함)
- 내부 요소는 힙으로 구성 → **이진트리** 구조 & 시간 복잡도: **O(NlogN)**

### **Priority Queue의 우선순위 기준 부여**
- **java.lang.Comparable**: 원소 스스로 다른 원소와 자신을 비교할 때 사용하는 방법
- **java.util.Comparator**: 두 개의 원소 대소 비교를 비교자가 판단하는 방법
    - compare 메소드를 구현해야함
    - 두 매개변수 **객체**를 비교<br>
[Comparator Override 문제: 절댓값힙](../../Heap_data_structure/Main_11286.java)<br>
- **직접 만든 클래스의 비교 기준**을 만들고 싶을 때: Comparable을 implements해서 사용
- 이미 비교 기준이 있는 **Integer, String, Character**등의 비교 기준을 변경: Comparator를 써서 확장

### **Comparable**
**"자기 자신과 매개변수 객체를 비교"**
- int compareTo(T other): 비교, 판단 결과를 int형으로 줌
- **"자기 자신 - other"** 형태
```java
// 기본 구조
public class ClassName implements Comparable<Type>{

    @Override
    public int compareTo(Type o){
        // 비교 구현
    }
}

// User name: 사전순, 이름이 같으면 나이순
public class User implements Comparable<User>{
    String name; int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o){
        int res = this.name.compareTo(o.name);
        if(res == 0) res = this.age - o.age;

        return res;
    }
}
```

### **Comparator**
"두 매개변수 객체를 비교**
- **int compare(T o1, T o2)**
- **o1 - o2**형태
    - 음수(o1 < o2): **오름차순 정렬**<br>
    - 양수(o1 > o2): **내림차순 정렬**<br>

```java
// 기본 구조
import java.util.Comparator;
import java.util.PriorityQueue;

// 클래스에서 사용
public static class ClassName implements Comparator<Type>{
    @Override
    public int compare(Type o1, Type o2){
        return o1 - o2;
    }
}

// PriorityQueue에서 사용
PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(new Comparator<Integer>(){
    @Override
    public int compare(Integer o1, Integer o2){
        return o1 - o2;
    }
});

// User name: 사전순, 이름이 같으면 나이순
PriorityQueue<User> pqueue = new PriorityQueue<User>(new Compartor<Integer>(){
    @Override
    public int compare(User o1, User o2){
        int res = o1.name - o2.name;
        if(res == 0) res = o1.age - o2.age;

        return res;
    }
});
```

## **Brute Foce(완전 탐색)이란?**
모든 가능한 경우의 수를 전부 탐색하여 문제를 해결하는 방법(즉, 노가다)

### **핵심 개념**
- 모든 경우의 수를 탐색
- 경우의 수는 주로 **Permutation(순열)**, **Combination(조합)**을 의미
- 보통 완전탐색은 아래와 같은 방식으로 구성
    - (순열 or 조합) + 탐색 로직(DFS or BFS)<br>

#### **언제 사용?**
- 시간 복잡도가 높음 So, 입력 크기가 작아서 전체 탐색 횟수가 1억(10^8)이하일 때, 사용

### **구현 방법**
1. **반복문 사용**
    - e.g. n번째로 등장하는 숫자 중 "2400"이 포함된 숫자 찾기
    ```java
    import java.util.Scanner;

    public class Main{
        public static void main(String args[])throws Exception{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int cnt = 0; int i = 2400;
            while(true){
                String s = String.valueOf(i);
                if(s.contains("2400")){
                    cnt++;
                    if(cnt == n){
                        System.out.println(s);
                        return;
                    }
                }
                i++;
            }
        }
    }
    ```

2. **재귀(DFS)를 사용**
    - e.g. 배열의 부분집합 중 합이 소수인 경우의 수 구하기
    ```java
    import java.util.*;

    public class Main{
        static int n;
        static int[] arr;

        public static void main(String args [])throws Exception{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            arr = new Int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(go(0, 0));
        }
        //소수 판별
        static int check(int num){
            if(num <= 1) return 0;
            if(num == 2) return 1;
            if(num %2 == 0) return 0;
            for(int i = 0; i*i <= num; i+= 2){
                if(num % i == 0) return 0;
            }
            return 1;
        }

        static int go(int idx, int sum){
            if(idx == n){
                return check(sum);
            }
            // 현재 배열 요소를 선택하거나 선택하지 않는 두 가지 경우
            return go(idx+1, sum + arr[idx]) + go(idx+1, sum);
        }
    }
    ```

### **Backtracking(백트래킹)**
완전 탐색에서 pruning을 추가한 방식 → 불필요한 탐색을 미리 제거하여 효율성을 높이는 방법(주로 재귀를 통해 구현)

#### **핵심 개념**
- 기본적으로는 완전 탐색
- 중간에 불필요한 경우를 미리 판단하고 탐색하지 않는 것이 특징 → 시간 복잡도를 크게 줄일 수 있음

#### **예시 코드**
- e.g. 배열의 부분집합 중 합을 mod 연산했을 때, 가장 큰 값을 구하는 문제
- 이미 최적값에 도달하면 더 이상 탐색하지 않고 종료    
    ```java
    import java.util.*;

    public class Main{
        static int n, ret = -2147483648;
        static int[] arr;
        static int mod = 11;

        public static void main(String args)throws Exception{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            go(0, 0);
            System.out.println(ret);
        }

        static void go(int idx, int sum){
            // 이미 최대값인 mod-1에 도달하면 더 이상 진행하지 않음
            if(ret == mod - 1) return; //pruning

            if(idx == n){
                ret = Math.max(ret, sum % mod);
                return;
            }

            go(idx + 1, sum + arr[idx]); // 현재 원소 포함
            go(idx + 1, sum)             // 현재 원소 미포함
        }
    }
    ```

### **완전 탐색 vs 백트래킹**

|    구분    |         완전 탐색      |      Backtracking   |
|:----------:|:---------------------:|:-------------------:|
|    개념    |      모든 경우의 수    |  완전 탐색 + 가지치기 |
| 시간 복잡도 |  높음 O(모든 경우의 수)|    상대적으로 낮음    |
|  사용 시점 |    입력 크기 작을 때    |입력 크기가 좀 더 클 때|
| 구현 난이도 |         쉬움          |      약간 어려움     |