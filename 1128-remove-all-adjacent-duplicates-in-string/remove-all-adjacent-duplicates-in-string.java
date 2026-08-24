class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> k = new Stack<>();
        for(int i=0;i<s.length();i++){
            char wo=s.charAt(i);
            if(!k.isEmpty() && k.peek()==wo){
                k.pop();
            }
            else{
                k.push(wo);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:k){
            sb.append(c);
        }
        return sb.toString();
    }
}