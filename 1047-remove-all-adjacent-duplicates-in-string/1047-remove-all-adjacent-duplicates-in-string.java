class Solution {
    public String removeDuplicates(String s) {
       String res = "";
       Stack<Character> st = new Stack<Character>();
       int i = 0;
       st.push(s.charAt(i++));
       while(i<s.length())
       {

           if(!st.isEmpty()&&st.peek()==s.charAt(i))
           {

               st.pop();
               i++;
           }
           else
            st.push(s.charAt(i++));
       }
       while(!st.isEmpty())
       {
           res+= st.peek();
           st.pop();
       }
        StringBuffer sbr = new StringBuffer(res);
        sbr.reverse();
        return sbr.toString();
    }
}