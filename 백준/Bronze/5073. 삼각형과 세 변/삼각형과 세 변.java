import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] arr = {a,b,c};
            if( a == 0){
                break;
            }

            Arrays.sort(arr);

            if( arr[2] >= (arr[0] + arr[1]) ){
                System.out.println("Invalid");
            } else {
                if( a == b && a == c ){
                    System.out.println("Equilateral");
                } else  if( a == b || a == c || b == c ){
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        }

        br.close();
	}
}