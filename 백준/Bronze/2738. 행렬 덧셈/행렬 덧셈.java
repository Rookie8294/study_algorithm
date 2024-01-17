import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<Integer>();
        String[] temp = new String[M];
        for( int i = 0; i<N*2; i++){
            temp = br.readLine().split(" ");
            for( int j = 0; j<M; j++){
                list.add(Integer.parseInt(temp[j]));
            }
        }

        int result = 0;
        for( int i = 0; i<list.size(); i++){
            if( i == list.size()/2 ){
                return;
            }

            result = list.get(i) + list.get(i + (N*M));
            System.out.print(result);
            if( (i+1)%M == 0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        br.close();
	}
}