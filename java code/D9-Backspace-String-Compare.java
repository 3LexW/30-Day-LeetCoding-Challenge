class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        for (char c: S.toCharArray()){
            if (c == '#'){
                if (!stack.isEmpty()) stack.pop();                
            }
            else stack.push(c);
        }
        
        S = "";
        while (!stack.isEmpty()) S = stack.pop() + S;

        for (char c: T.toCharArray()){
            if (c == '#'){
                if (!stack.isEmpty()) stack.pop();                
            }
            else stack.push(c);
        }
        
        T = "";
        while (!stack.isEmpty()) T = stack.pop() + T;
        
        return S.equals(T);
    }
}
