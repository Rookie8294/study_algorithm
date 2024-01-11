import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Case #1: 1 + 1 = 2
public class Main{
	public static void main(String[] args) throws Exception {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for( int i = 1; i<cnt+1; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
	}
}