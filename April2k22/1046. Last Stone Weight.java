class Solution {
    public int lastStoneWeight(int[] stones) {        
        List<Integer> list = new ArrayList<Integer>();
        for(int element : stones)
        {
            list.add(element);
        }
        
        int el2=0;
        Collections.sort(list, Collections.reverseOrder());
        while(list.size()>1)
        {
            int el1 = list.get(0);
            if(list.size()>=2)
            {
                el2 = list.get(1);
            }
            list.remove(list.get(0));
            list.remove(list.get(0));
            if(el1!=el2)
            {
                list.add(el1-el2);
            }
            Collections.sort(list, Collections.reverseOrder());
        }
        if(list.size()>0)
        return list.get(0);
        
        return 0;
    }
}

