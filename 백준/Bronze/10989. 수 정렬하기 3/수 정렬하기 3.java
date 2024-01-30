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
        int[] countArr = new int[10001];
        //값 배열에 담기
        for(int i = 0; i<cnt; i++){
            countArr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1; i<10001; i++){
            
            while( countArr[i] > 0){
                sb.append(i).append("\n");
                countArr[i]--;
            }
        }

        System.out.println(sb);


        br.close();
	}
}
