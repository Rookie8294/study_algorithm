import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        boolean[][] canvas = new boolean[101][101];
        int cnt = Integer.parseInt(br.readLine());
        String[] target;
        int x = 0;
        int y = 0;
        for( int i = 0; i<cnt; i++){
            target = br.readLine().split(" ");
            x = Integer.parseInt(target[0]);
            y = Integer.parseInt(target[1]);
            for( int j = y; j<y+10; j++ ){
                for( int k = x; k<x+10; k++){
                    canvas[j][k] = true;
                }
            }
        }
        int result = 0;
        for( int i = 1; i<canvas.length; i++){
            for(int j = 1; j<canvas[i].length; j++){
                if( canvas[i][j] ){
                    result++;
                }
            }
        }

        System.out.print(result);

        br.close();
	}


}