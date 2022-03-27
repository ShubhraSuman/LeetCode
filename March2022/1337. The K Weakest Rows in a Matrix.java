class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int count = 0;
        int []res = new int[mat.length];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(); 
        for(int i = 0;i<mat.length;i++)
        {
            count = 0;
            for(int j = 0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            res[i] = count;
            map.put(i,count);
        }
        Arrays.sort(res);
        for(int i = 0;i<k;i++)
        {
            for(Integer k1 : map.keySet())
            {
                int v=res[i];
                if(map.get(k1)==res[i])
                {
                    res[i]=k1;
                    map.remove(k1);
                    break;
                }
            }
        }
        int[] newArray = Arrays.copyOfRange(res, 0, k);
        return newArray;
    }
}
