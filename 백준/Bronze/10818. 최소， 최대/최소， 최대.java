import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());
        int min = target;
        int max = target;
        
        for( int i = 0; i<cnt-1; i++){
            target = Integer.parseInt(st.nextToken());
            if( min > target ){
                min = target;
            }
            if( max < target ){
                max = target;
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}