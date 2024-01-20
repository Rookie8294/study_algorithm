import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());
        int cross_count = 1;
        int pre_count_sum = 0;

        while(true){
            if( input <= (cross_count + pre_count_sum) ){

                if( cross_count % 2 == 0 ){ // 짝수

                    System.out.println( ( input - pre_count_sum  ) + "/" + ( cross_count - (input - pre_count_sum) + 1)  );
                    break;
                } else{ // 홀수
                    System.out.println( ( cross_count - (input - pre_count_sum) + 1) + "/" + ( input - pre_count_sum  )  );
                    break;
                }

            } else {
                pre_count_sum += cross_count;
                cross_count++;

            }

        }
        

        br.close();
	}
}

