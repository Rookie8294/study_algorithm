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
        
        int N = Integer.parseInt(br.readLine());

        for( int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int NN = Integer.parseInt(st.nextToken());
            int[] arr = new int[NN];
            long sum = 0;
            for( int j = 0; j<NN; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for( int j = 0; j<arr.length; j++){
                for( int k = j+1; k<arr.length; k++){
                    sum += gcd2(arr[j], arr[k]);
                }
            }

            sb.append(sum).append("\n");
        }
        System.out.print(sb);
        br.close();
	}
    public static int gcd2(int a, int b){

        while (b != 0){
            int r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}