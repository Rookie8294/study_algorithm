import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());

        if( cnt == 1){
            System.out.println(0);
            return;
        }
        int[] xArr = new int[cnt];
        int[] yArr = new int[cnt];
        for(int i = 0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            xArr[i]= Integer.parseInt(st.nextToken());
            yArr[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);


        System.out.println( (xArr[0] - xArr[cnt - 1]) * (yArr[0] - yArr[cnt - 1]) );


        br.close();
	}
}