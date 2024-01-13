import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);
        int[] arr = new int[N+1];
        for( int i = 1; i< arr.length; i++){
            arr[i] = i;
        }

        int left;
        int right;
        int temp = 0;
        for( int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            left = Integer.parseInt(st.nextToken());
            right = Integer.parseInt(st.nextToken());

            while( left < right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for( int i = 1; i<arr.length; i++){
            sb.append(arr[i]);
            if( i != arr.length-1){
                sb.append(" ");
            }
        }

        System.out.print(sb);

        br.close();
	}
}