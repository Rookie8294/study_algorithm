import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static boolean[] isVisited;
    static int[] parentNode;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        isVisited = new boolean[n + 1];
        parentNode = new int[n + 1];
        list = new ArrayList[n + 1];
        for( int i = 0; i<=n; i++){
            list[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for( int i = 1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }
        dfs(1);

        for( int i = 2; i<=n; i++){
            System.out.println(parentNode[i]);
        }
    }
    
    static void dfs(int idx){
        isVisited[idx] = true;

        for( int i : list[idx]){
            if (!isVisited[i]) {
                parentNode[i] = idx;
                dfs(i);
            }
        }
    }

}
