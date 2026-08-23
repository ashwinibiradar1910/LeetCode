class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n= s.length();
        for(int i=0;i<n;i++){
            char k=s.charAt(i);
            if(k=='[' || k=='{'|| k=='('){
                st.push(k);
            }
            else{
                if(st.isEmpty() || ( k=='}' && st.peek()!='{') || ( k==']' && st.peek()!='[') || ( k==')' && st.peek()!='(')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}