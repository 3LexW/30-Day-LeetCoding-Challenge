class Solution {
    public boolean checkValidString(String s) {
        //From left, # of ( and * always >= # of )
        int cnt = 0;
        for (char c: s.toCharArray()){
            cnt += (c != ')')? 1:-1;
            if (cnt < 0) return false;
        }
        
        //From right, # of ) and * always >= # of (
        cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            cnt += (c != '(')? 1:-1;
            if (cnt < 0) return false;
        }
        
        return true;
    }
}
