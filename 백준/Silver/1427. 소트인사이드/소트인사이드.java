import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //      카운팅 정렬
        String target = br.readLine();
        int[] countArr = new int[10];

        for (int i = 0; i < target.length() ; i++) {
            countArr[target.charAt(i) - '0']++;
        }


        for( int i = 9; i>=0 ; i--){

            while (countArr[i] > 0){
                sb.append(i);
                countArr[i]--;
            }
        }

        System.out.println(sb);

        br.close();
	}
}
