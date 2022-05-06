class Solution {
    public String removeDuplicates(String s, int k) {
        String ans = "";
        Stack<Pair<Character,Integer>> st = new Stack<>();
        Pair p1 = new Pair(s.charAt(0),1);
        st.push(p1);
        for(int i = 1; i<s.length(); i++)
        {
            if(st.empty())
            {
                Pair p2 = new Pair(s.charAt(i),1);
                st.push(p2);
            }
            else if(!st.empty())
            {
                Character topElement = st.peek().getKey();
                if(topElement == s.charAt(i))
                {
                    int count = st.peek().getValue();
                    if(count == k-1)
                    {
                        st.pop();
                    }
                    else
                    {
                        st.pop();
                        st.push(new Pair(s.charAt(i),count+1));
                    }
                }
                else
                {
                    Pair p3 = new Pair(s.charAt(i),1);
                    st.push(p3);
                }
            }
        }
        while(!st.empty())
        {
            int c = st.peek().getValue();
            while(c>0)
            {
                ans += st.peek().getKey();
                c--;
            }
            st.pop();
        }
        StringBuilder input1 = new StringBuilder();
        input1.append(ans);
        input1.reverse();
 
        return input1.toString();
    }
}
