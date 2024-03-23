import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
         int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] km = new int[n - 1];
        for( int i = 0; i<km.length; i++){
            km[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] cost = new int[n];
        for( int i = 0; i<n; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        km[0] = cost[0]*km[0];
        for( int i = 1; i<km.length; i++){
            int a = cost[i-1]*km[i];
            int b = cost[i]*km[i];

            int min = Math.min(a, b);

            km[i] = km[i-1] + min;
        }
        
        System.out.println(km[km.length-1]);

        br.close();
	}
}