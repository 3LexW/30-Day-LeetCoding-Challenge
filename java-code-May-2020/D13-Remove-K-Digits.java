class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) return "0";
        //If a digit is smaller than the previous one, discard the previous one
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++){
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        
        //If k != 0, remove from the bottom
        while (k > 0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());
        
        sb.reverse();
        
        //Remove 0's at the top
        while(sb.length() > 1 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.toString();
    }
}
