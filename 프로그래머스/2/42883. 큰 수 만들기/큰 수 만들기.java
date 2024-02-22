import java.lang.StringBuilder;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = number.toCharArray();
        int n = number.length() - k;
        int start = 0;
        for(int i = 0; i<n; i++){
            char max = '0';
            for( int j = start; j<=i+k; j++){
                if( max < arr[j]){
                    max = arr[j];
                    start = j+1;
                }
            }
            sb.append(max);
        }
        
        
        return sb.toString();
    }
}