class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair<Character,Integer>> validStack = new Stack<>();
        char[] ans = s.toCharArray();
        for(int i = 0;i<ans.length;i++)
        {
            if(ans[i]=='(')
            {
                Pair p = new Pair('(',i);
                validStack.add(p);
                 // System.out.println("Push "+ validStack.peek().getKey());
            }
            else if(ans[i]==')')
            {
                if(!validStack.empty()&&validStack.peek().getKey()=='(')
                {
                     // System.out.println("Pop "+validStack.peek().getKey());
                    validStack.pop();
                }
                else
                {
                    Pair p = new Pair(')',i);
                    validStack.add(p);
                }  
            }
        }
         StringBuilder sb = new StringBuilder(s);
        while(!validStack.isEmpty()){
            int index = validStack.peek().getValue();
            sb.deleteCharAt(index);
            validStack.pop();
        }
        return sb.toString();
    }
}
