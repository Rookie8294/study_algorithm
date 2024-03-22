import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
       	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] order = new int[k];
        boolean[] multiStrip = new boolean[101];

        st = new StringTokenizer(br.readLine());
        for( int i = 0; i<k; i++){
            order[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int put = 0;

        for( int i = 0; i<k; i++){
            int temp = order[i];

            if( !multiStrip[temp] ) { // 멀티탭이 꽂혀있지 않을 경우
                if (put < n) {
                    multiStrip[temp] = true;
                    put++;
                } else { // 멀티탭이 모두 꽂혀있을 경우
                    ArrayList<Integer> list = new ArrayList<>();
                    for( int j = i; j<k; j++){
                        if( multiStrip[order[j]] && !list.contains(order[j])){
                            list.add(order[j]);
                        }
                    }

                    if( list.size() != n ){ // 꽂혀 있는 콘센트와 꽂을 콘센트의 종류가 하나라도 다르다면
                        for( int j = 0; j<multiStrip.length; j++){
                            if (multiStrip[j] && !list.contains(j) ){ // 겹치는 부분이 없는 콘센트를 뺀다
                                multiStrip[j] = false;
                                break;
                            }
                        }
                    } else { //현재 꽂혀 있는 콘센트가 모두 꽂을 콘센트와 같다면
                        int remove = list.get(list.size() - 1);
                        multiStrip[remove] = false;
                    }

                    multiStrip[temp] = true;
                    cnt++;

                }
            }
        }

        System.out.println(cnt);
        
        

        br.close();
	}
    
}