class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String target = "";
        int num = n;
        
        for( int i = 0; i<control.length(); i++){
        
            if( control.charAt(i) == 'w') num += 1;
            else if( control.charAt(i) == 's' ) num -= 1;
            else if( control.charAt(i) == 'd' ) num += 10;
            else num -= 10;
        }
        
        answer = num;
        return answer;
    }
}