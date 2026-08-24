class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String temp = tokens[i];
            if(temp.equals("+")||temp.equals("-")||temp.equals("*")|| temp.equals("/")){
                int a1=st.pop();
                int a2 =st.pop();
                switch(temp){
                    case "+":
                        st.push(a1+a2);
                        break;
                    case "-":
                        st.push(a2-a1);
                        break;
                    case "/": 
                        st.push(a2/a1);
                        break;
                    case "*":
                        st.push(a2*a1);
                        break;
                }
            }
            else{
                int k = Integer.parseInt(temp);
                st.push(k);
            }
        }
        return st.peek();
    }
}