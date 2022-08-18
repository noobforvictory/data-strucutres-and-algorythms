
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
    
    for(int i=0;i<s.length();i++){
        if(st.empty()){
            st.push(s.charAt(i));
        }
        else if (st.peek() == '(' &&s.charAt(i)==')'){
            st.pop();
        }
        else if (st.peek() == '{' &&s.charAt(i)=='}'){
            st.pop();
        }
        else if (st.peek() == '[' &&s.charAt(i)==']'){
            st.pop();
        }
        else{
            st.push(s.charAt(i));
        }
    }
    return st.empty();
    }
}