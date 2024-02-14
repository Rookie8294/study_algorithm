import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main{
    
    public static boolean[] primeArr = new boolean[1000000];
    
	public static void main(String[] args) throws IOException {
        getPrime();
        
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        while (true){
            int n = Integer.parseInt(br.readLine());
            boolean flag = false;

            if( n == 0 ){
                break;
            }

            for(int i = 2; i<=n/2; i++){
                if( !primeArr[i] && !primeArr[n-i] ){
                    sb.append(n).append(" = ").append(i).append(" + ").append(n - i).append("\n");
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
        
        System.out.print(sb);
	}
    public static void getPrime(){

        primeArr[0] = true;
        primeArr[1] = true;

        for(int i = 2; i<=Math.sqrt(primeArr.length); i++){
            // 이미 소수이면 continue
            if( primeArr[i]){
                continue;
            }
            //j = i*i = 4 부터시작
            // 2,3 은 소수이기때문에 i*i부터 시작
            for( int j = i*i; j<primeArr.length; j+=i){
                primeArr[j] = true;
            }
        }
    }
    
}