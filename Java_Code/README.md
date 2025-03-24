# Java 문법

## 조건문

1. **for문**

```java
a = 1;
b = 2;
if(a > b){
    System.out.println("A가 B보다 큼");
}
else if(a < b){
    System.out.println("B가 A보다 큼");
}
else{
    System.out.println("A와 B는 같음");
}
```

2. **삼항연산자**

```java
a = 1; b = 2;
System.out.println(a > b ? "A가 큼" : a < b ? "B가 큼" : "A와 B는 같음");
```

3. **switch문**

```java
// 시험 성적 문제
Scanner sc = new Scanner(System.in);
int score = sc.nextInt();
char grade;
switch(sc / 10){
    case 10:
    case 9:
        grade = 'A';
        break;
    case 8:
        grade = 'B';
        break;
    case 7:
        grade = 'C';
        break
    default:
        grade = 'F';
}
System.out.println(grade);
```

## 반복문

1. **for문**
    - for(초기화식; 조건식; 증감식){실행문;}
    - **조건식:** 조건식 전까지

```java
    int sum = 0;
    for(i = 1; i <= 10; i++){
        sum += i;
    }
```
2. **while문**
    - while(조건식){실행문;}
    - 주로 비교 & 논리 연산식에 사용
    - for문과 다르게 초기화식은 밖에, 증감식은 안에

```java
    int sum = 0;
    int i = 1;
    while(i <= 10){
        sum += i;
        i++;
    }
```

3. **do-while문**
    - do {실행문} while (조건식);  // 조건식이 뒤, 조건식이 true일 경우 반복, false일 경우 중단
    - do문을 먼저 검증 후 while문 안에 로직 실행
    - **즉, 실행 후 로직 검사**
```java
    int sum = 0;
    int i = 1;
    do{
        sum += i;
        i++;
    }while(i <= 10);
```

4. **break-label**
    - 이중 반복문에서 특정 조건이 만족할 때 반복문 종료

```java
// label을 Outter로 선언 -> 변수 값이 소문자 g가 되면 반복문 종료
Outter:
for(char upper='A'; upper <='Z'; upper++){
    for(char lower='a'; lower <='z'; lower++){
        System.out.println(upper + '-' + lower);
        if(lower=='g'){
            break Outter;
        }
    }
    System.out.println("프로그램 종료");
}
```
```
[결과]
A - a
A - b
A - c
A - d
A - e
A - f
A - g
프로그램 종료
```

## 배열
- **배열**이란? 고정된 개수의 단일 타입 값들을 담고 있는 객체
- **배열의 요소(components; 컴포넌트)**: 배열에 들어있는 변수들
- **배열 요소의 타입(components type)**: 모든 요소들이 가지는 같은 타입
- If 배열에 n개(**배열의 길이**)의 요소 then 각 요소는 **0 ~ n-1까지**의 정수 인덱스를 가짐
- **배열이 생성된 이후에는 길이가 고정**
- 배열이 메모리 상에서 연속적으로 위치하지 않아도된다.
    ```
    JLS에서는 배열이 객체
    동시에 JVMS에서는 배열과 객체가 JVM에 힙에 저장된다고 함
    그러나 JVMS는 힙 메모리가 연속적일 필요가 없다
    즉, 모든 배열이 힙에 저장되고 힙이 연속이지 않을 수 있으므로 배열도 연속적이지 않을 수 있다.
    ```
※ **JLS(Java Language Specification)**: 자바 언어 명세서

※ **JSR(Java Specification Request)**
: JCP(자바 커뮤니티 프로세스)의 새 명세를 위해 구성된 팀원들에 의해 만들어진 문서

※ **JEP(Java Enhancement Proposal; 자바 강화 제안)**: 
: 자바 코어 기술을 강화하기 위한 제안 문서

※ **JVM(Java Virtual Machine)**: 자바를 실행하기 위한 가상 기계

Java는 OS에 종속적이지 않다 -> 그러면 실행되려면? -> JVM이 필요
**즉, OS에 종속받지 않고 CPU가 Java를 인식, 실행할 수 있게 하는 가상 컴퓨터**
![컴파일 과정](/Java_Code/img/java_compile_process.png)
```
Java 소스코드(*.java)는 CPU가 인식 불가 -> 
Java Compiler(JDK 설치시 bin에 존재하는 javac.exe)가 JVM이 인식 가능한 Java bytecode(JVM이 이해할 수 있는 언어로 변환된 자바 소스코드)로 변환(*.class) ->
JVM이 OS가 이해 가능하도록 Java bytecode를 해석 
```



## 2차원 배열

## 문자열

