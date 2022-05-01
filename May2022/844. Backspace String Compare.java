class Solution {
    private String stringAftrBsRemoval(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
        }
        // System.out.println(st.toString());
        return st.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return stringAftrBsRemoval(s).equals(stringAftrBsRemoval(t));
    }
}
