import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        int target = Integer.parseInt(br.readLine());
        int compare = 0;

        Long num = 666L;
        int leng = 0;
        String strNum = "";
        while(true){
            strNum = String.valueOf(num);
            leng = strNum.length();
            int cnt = 0;
            for( int i = 0; i<leng; i++){
                if( strNum.charAt(i) == '6' ){
                    cnt++;
                } else if( strNum.charAt(i) != '6' && cnt < 3){
                    cnt = 0;
                }
            }
            if( cnt >= 3 ){
                compare++;
            }
            if( compare == target){
                break;
            }
            num++;
        }

        System.out.println(num);

        br.close();
	}
}