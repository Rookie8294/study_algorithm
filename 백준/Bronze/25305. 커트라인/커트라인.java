import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int cnt = Integer.parseInt(arr[0]);
        int cut = Integer.parseInt(arr[1]);
        int[] scoreArr = new int[cnt];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 0; i<cnt; i++){
             scoreArr[i] = Integer.parseInt(st.nextToken());           
        }
        
        Arrays.sort(scoreArr);
        
        System.out.println(scoreArr[scoreArr.length  - cut ]);

        br.close();
	}
}