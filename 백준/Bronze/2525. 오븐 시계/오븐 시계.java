import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        int target = minute + time;
        
        if( target > 59 ){
            hour += target/60;
            minute = target%60;
            if( hour > 23){
                hour = hour - 24;
            }
            System.out.println(hour+" "+minute);
        } else {
            System.out.println(hour+" "+target);
        }

	}
}