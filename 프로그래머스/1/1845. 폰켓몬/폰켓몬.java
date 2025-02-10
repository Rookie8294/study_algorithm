import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        int size = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int num : nums ){
            map.put(num, 1);
        }
        
        size = map.size();
        
        if( size > n ) answer = n;
        if( size <= n ) answer = size;
        
        return answer;
    }
}