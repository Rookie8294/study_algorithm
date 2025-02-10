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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] primeArr = makePrime(M);
        for(int i =N; i<=M; i++){
            if( primeArr[i] ){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
	}
    public static boolean[] makePrime(int maxNumber){
        boolean[] primeArr = new boolean[maxNumber+1];

        //배열의 값들을 true로 초기화 ( 0과 1은 소수가 아니기 때문에 제외 )
        for(int i = 2; i<primeArr.length; i++){
            primeArr[i] = true;
        }

        for(int i = 2; i<=Math.sqrt(maxNumber); i++){
            if(primeArr[i]){
                //j = i*i = 4 부터시작
                // 2,3 은 소수이기때문에 i*i부터 시작
                for( int j = i*i; j<=maxNumber; j+=i){
                    primeArr[j] = false;
                }
            }
        }

        return primeArr;
    }
}