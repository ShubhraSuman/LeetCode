class Solution {
    public boolean isBipartite(int[][] graph) {
        int size = graph.length;
        int color[] = new int[size+1];
        Arrays.fill(color,-1);
        for(int i = 0;i<size;i++)
        {
            if(color[i] == -1)
            {
                Queue<Integer> connected = new LinkedList<>();
                connected.offer(i);
                color[i] = 1;
                while(!connected.isEmpty())
                {
                    int k = connected.poll();
                    for(int attached : graph[k])
                    {
                        if(color[attached] == -1)
                        {
                            color[attached] = 1 - color[k];
                            connected.offer(attached);
                        }
                        else if(color[attached] != -1)
                        {
                            if(color[attached] == color[k])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
