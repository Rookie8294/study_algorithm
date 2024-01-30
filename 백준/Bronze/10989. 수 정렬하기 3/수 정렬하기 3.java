import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        int target = 0;
        //counting array
        int[] countArr = new int[20000001];
        //값 배열에 담기
        for(int i = 0; i<cnt; i++){
            target = Integer.parseInt(br.readLine());
            if( countArr[target + 10000000] >= 0 ){
                countArr[target + 10000000] += 1;
            }
        }

        for(int i = 0; i<countArr.length; i++){
            if( countArr[i] > 1 ){
                for(int j = 0; j<countArr[i]; j++){
                    sb.append(i - 10000000).append("\n");
                }
            } else if( countArr[i] == 1 ){
                sb.append(i - 10000000).append("\n");
            }
        }

        System.out.println(sb);


        br.close();
	}
}
