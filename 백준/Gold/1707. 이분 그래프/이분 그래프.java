import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static final int RED = 1;
    static final int BLUE = -1;
    static int[] colors;
    static ArrayList<Integer>[] graph;
    static boolean checkBipartite;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());

        for( int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            checkBipartite = true;
            colors = new int[v + 1];
            graph = new ArrayList[v + 1];
            for( int j = 0; j<v+1; j++){
                graph[j] = new ArrayList<>();
                colors[j] = 0;
            }

            for( int k = 0; k<e; k++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph[a].add(b);
                graph[b].add(a);
            }

            for( int l = 1; l<v+1; l++){
                if( !checkBipartite ) break;
                if( colors[l] == 0 ){
                    dfs(l, RED);
                }
            }

            System.out.println(checkBipartite ? "YES" : "NO");
        }//end for
	
    }
    static void dfs(int v, int color){
        colors[v] = color;

        for (int i : graph[v]) {
            if( colors[i] == color ){
                checkBipartite = false;
                return;
            }

            if( colors[i] == 0 ){
                dfs(i, -color);
            }
        }
    }

}
