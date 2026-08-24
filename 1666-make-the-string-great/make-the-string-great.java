class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(!st.isEmpty() && Character.toLowerCase(st.peek()) == Character.toLowerCase(k) && st.peek() != k ){
                st.pop();
            }
            else{
                st.push(k);
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char ch :st){
            sb.append(ch);
        }
        String res = sb.toString();
        return res;
    }
}