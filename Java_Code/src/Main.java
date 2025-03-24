import java.io.IOException;

public class Main {

    public void solution() throws IOException{
        int sum = 0;
        int i = 1;
        do{
            sum += i;
            i++;
        }while(i < 10);
        System.out.println(sum);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}