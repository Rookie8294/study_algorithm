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
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] distanceArr = new int[n];
        for( int i = 0; i<n; i++){
            int target = Integer.parseInt(st.nextToken());
            int distance = Math.abs(s-target);
            distanceArr[i] = distance;
        }
        int answer = distanceArr[0];
        for(int i = 1; i<n; i++){
            answer = gcd(answer, distanceArr[i]);
        }
        System.out.print(answer);
        br.close();
	}
    
    public static int gcd(int a, int b){

        while (b != 0){
            int r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}
