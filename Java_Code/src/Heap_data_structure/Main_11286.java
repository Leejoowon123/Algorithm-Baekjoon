package Heap_data_structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Comparator;

// 절댓값 힙 문제
public class Main_11286 {
    
    public void solution()throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(Math.abs(o1) > Math.abs(o2)){
                    return Math.abs(o1) - Math.abs(o2);
                }else if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }else{
                    return -1;
                }
            }
        });
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pqueue.isEmpty()) sb.append(0).append("\n");
                else sb.append(pqueue.poll()).append('\n');
            }else pqueue.offer(x);
        }

        System.out.println(sb);
    }

    public static void main(String args[])throws Exception{
        new Main_11286().solution();
    }
}
