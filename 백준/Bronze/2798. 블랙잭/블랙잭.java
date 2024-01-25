import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int cnt = Integer.parseInt(arr[0]);
        int target = Integer.parseInt(arr[1]);
        int sum = 0;
        String[] cards = br.readLine().split(" ");
        int num_i = 0;
        int num_j = 0;
        int num_k = 0;
        int min = 0;
        for( int i = 0; i<cnt-2; i++){
            for(int j = i+1; j<cnt-1; j++ ){
                for( int k = j+1; k<cnt; k++){
                    num_i = Integer.parseInt(cards[i]);
                    num_j = Integer.parseInt(cards[j]);
                    num_k = Integer.parseInt(cards[k]);
                    sum = num_i + num_j + num_k;
                    if(  min < sum && sum <= target){
                        min = sum;
                    }
                }
            }
        }

        System.out.println(min);

        br.close();
	}
}