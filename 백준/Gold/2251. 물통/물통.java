import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main{
    static int capaA, capaB, capaC;
    static boolean[][][] visited;
    static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        visited = new boolean[201][201][201];
        result = new ArrayList<>();

        capaA = Integer.parseInt(st.nextToken());
        capaB = Integer.parseInt(st.nextToken());
        capaC = Integer.parseInt(st.nextToken());

        bfs();
        Collections.sort(result);
        
        for( int i : result ) sb.append(i).append(" ");
        
        System.out.print(sb);
        
    }
    static class Water{
        private int a, b, c;

        public Water(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static void bfs(){
        Queue<Water> queue = new LinkedList<>();
        queue.add(new Water(0, 0, capaC));

        while (!queue.isEmpty()) {
            Water water = queue.poll();
            int a = water.a;
            int b = water.b;
            int c = water.c;

            if ( visited[a][b][c] ) continue;

            // 방문하지않은 즉, 검사하지 않은 부분 체크
            visited[a][b][c] = true;

            // a물통이 비어있다면 c물통의 물 결과에 추가
            if( a == 0 ) result.add(c);

            // a -> b
            if( a+b >= capaB) { queue.add(new Water(a-(capaB-b), capaB, c)); }// 옮겼을때 넘치는 경우
            else { queue.add(new Water(0, a+b, c)); }
            // b -> a
            if( b+a >= capaA) { queue.add(new Water(capaA, b-(capaA-a), c)); }
            else { queue.add(new Water(b+a, 0, c)); }
            // a -> c
            if( a+c >= capaC) { queue.add(new Water(a-(capaC-c), b, capaC)); }
            else { queue.add(new Water(0, b, a+c)); }
            // b -> c
            if( b+c >= capaC) { queue.add(new Water(a, b-(capaC-c), capaC)); }
            else { queue.add(new Water(a, 0, b+c)); }
            // c -> a
            if( c+a >= capaA) { queue.add(new Water(capaA, b, c-(capaA-a))); }
            else { queue.add(new Water(c+a, b, 0)); }
            // c -> b
            if( c+b >= capaB) { queue.add(new Water(a, capaB, c-(capaB-b))); }
            else { queue.add(new Water(a, c+b, 0)); }

        }
    }
}