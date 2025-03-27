package Heap_data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// 최대힙 문제
public class Main_11279 {
    
    // Collections.reverseOrder()를 입력하여 역정렬
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x > 0){
                pqueue.offer(x);
            }
            else{
                if(!pqueue.isEmpty()){
                    sb.append(pqueue.poll()).append('\n');
                }else{
                    sb.append(0).append('\n');
                }
            }
        }
        System.out.println(sb);
        br.close();
    }

    public static void main(String args[])throws Exception{
        new Main_11279().solution();
    }
}
