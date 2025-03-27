package Heap_data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최소힙 문제
public class Main_1927 {
    
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x > 0){
                queue.offer(x);
            }else{
                if(!queue.isEmpty()) System.out.println(queue.poll()); 
                else System.out.println(0);
            }
        }

        br.close();
        
    }
    
    public static void main(String args [])throws Exception{
        new Main_1927().solution();
    }
}
