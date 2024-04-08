import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for( int i = 0; i<participant.length; i++){
           map.put(participant[i], map.containsKey(participant[i])? map.get(participant[i])+1 : 1 );       
        }
        
        for( int i = 0; i<completion.length; i++){
            map.put(completion[i], map.get(completion[i]) -1 );
        }
        
        for( String str : map.keySet() ){
            if( map.get(str) != 0 ){
                answer = str;
            }
        }
            
        
        return answer;
    }
}