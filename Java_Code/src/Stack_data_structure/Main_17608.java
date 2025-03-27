package Stack_data_structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 막대기
public class Main_17608 {
    
    public void solution()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack <>();
        
        for(int i = 0; i < num; i++){
            int height = Integer.parseInt(br.readLine());
            while(!stack.isEmpty() && height >= stack.peek()) stack.pop();
            stack.push(height);
        }
        
        bw.write(stack.size()+ " ");

        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String args[])throws Exception{
        new Main_17608().solution();
    }
}
