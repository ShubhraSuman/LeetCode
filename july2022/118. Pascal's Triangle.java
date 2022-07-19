class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<List<Integer>>();
         List<Integer> temp= new ArrayList<Integer>();
         List<Integer> pre = null;
         temp.add(1);
         ans.add(temp);
         pre = temp;
         int i;
         for( i = 2;i<=numRows;i++)
         {
             temp = new ArrayList<Integer>();
             for(int k = 0;k<i;k++)
             {
                 if(k==0 || k == (i-1))
                 {
                     temp.add(1);
                 }
                 else
                 {
                     // System.out.println(pre.get(k-1)+" "+pre.get(k));
                     temp.add(pre.get(k-1)+pre.get(k));
                 }
             }
             ans.add(temp);
             pre = temp;
         }
        return ans;
    }
}
