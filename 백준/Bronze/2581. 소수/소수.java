import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for( int i = a; i<b+1; i++){
            int cnt = 0;
            for( int j = 1; j<i+1; j++){
                if( i % j == 0 ){
                   cnt++;
                }
            }
            if( cnt == 2 ){
                list.add(i);
                sum+=i;
            }
        }
         if( sum != 0 ){
            System.out.println(sum);
            System.out.println(list.get(0));
        }else {
            System.out.println(-1);
        }
        

        br.close();
	}
}

