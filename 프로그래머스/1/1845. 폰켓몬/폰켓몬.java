import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;        
        Set<Integer> set = new HashSet<>();

        for( int i : nums ){
            set.add(i);
        }

        if( set.size() <= (nums.length/2)) answer = set.size();
        
        return answer;
        
        
    }
}