package Stack_data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_6198 {
    
    public static long sum;

    public void solution()throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < num; i++){
            int height = Integer.parseInt(br.readLine());
            
            while(!stack.isEmpty()){
                if(stack.peek() <= height){
                    stack.pop();
                }else break;
                
            }
            sum += stack.size();
            stack.push(height);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String args[])throws Exception{
        new Main_6198().solution();
    }
}
