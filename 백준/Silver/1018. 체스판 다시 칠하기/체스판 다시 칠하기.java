import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    
    public static boolean[][] arr;
    public static int min = 64;
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String[] N_M_Arr = br.readLine().split(" ");
        int N = Integer.parseInt(N_M_Arr[0]);
        int M = Integer.parseInt(N_M_Arr[1]);
        
        //boolean배열 생성 W -> true | B -> false
        arr = new boolean[N][M];
        for(int i = 0; i<N; i++){
            String line = br.readLine();
            for( int j = 0; j<M; j++){
                if( line.charAt(j) == 'W' ){
                  arr[i][j] = true;
                } else {
                  arr[i][j] = false;
                }
            }
        }
        
        int x = M - 7;
        int y = N - 7;
        for( int i = 0; i<y; i++){
            for( int j = 0; j<x; j++){
                find(j, i);
            }
        }
        
        System.out.print(min);
        
        br.close();
	}
    
    public static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        //첫 문자
        boolean flag = arr[y][x];
        
        for(int i = y; i<end_y; i++){
            for(int j = x; j<end_x; j++){
                if( arr[i][j] == flag ){
                    count++;
                }
                flag = !flag;
            }
            flag = !flag;
        }
        
        count = Math.min(count, 64-count);
        
        min = Math.min(min, count);
    }
}