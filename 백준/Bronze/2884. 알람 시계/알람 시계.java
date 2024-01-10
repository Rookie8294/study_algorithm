import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int target = minute-45;
        if( target < 0 ){
            minute = 60 + target;
            hour = hour - 1;
            if( hour < 0 ){
                hour = 23;
            }
            System.out.println(hour+" "+minute);
        } else {
            System.out.println(hour+" "+target);
        }        

	}
}