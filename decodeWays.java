class decodeWays {
    //https://leetcode.com/problems/decode-ways/
    public int numDecodings(String s) {
        int [] memo = new int[s.length() + 1];
        memo[0] = 1;
        memo[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= s.length(); i++){
            int one = Integer.parseInt(s.substring(i-1, i));
            int two = Integer.parseInt(s.substring(i-2, i));
            if(one >= 1 && one <= 9){
                memo[i] += memo[i - 1];
            }
            if(two >= 10 && two <= 26){
                memo[i] += memo[i - 2];
            }
        }
        return memo[s.length()];
        
    }
}