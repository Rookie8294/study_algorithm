import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main{
    static int[][] square;
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        square = new int[9][9];

        for( int i = 0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for( int j = 0; j<9; j++){
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);
        

        br.close();
	}
     static void dfs(int y, int x){

        if( x == 9 ){
            dfs(y + 1, 0);
            return;
        }

        if( y == 9 ){
            for( int[] arr : square ){
                for( int i : arr){
                    sb.append(i).append(" ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
            System.exit(0);
        }


        if( square[y][x] == 0){
            for( int i = 1; i<=9; i++){
                if( isCheck(y, x, i)){
                    square[y][x] = i;
                    dfs(y, x+1);
                }
            }
            square[y][x] = 0;
            return;
        }

        dfs(y, x + 1);


    }
     
    static boolean isCheck(int y, int x, int value){
        //가로 체크
        for( int i = 0; i<9; i++){
            if( square[y][i] == value ){
                return false;
            }
        }

        //세로 체크
        for( int i = 0; i<9; i++){
            if( i == y )continue;
            if( square[i][x] == value ){
               return false;
            }
        }

        //미니 사격형 체크
        int startX = (x / 3) * 3;
        int startY = (y / 3) * 3;
        for( int i = startY; i<startY + 3; i++){
            for( int j = startX; j<startX + 3; j++){
                if( square[i][j] == value ){
                    return false;
                }
            }
        }

        return true;
    }
        
}