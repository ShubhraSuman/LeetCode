class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // This is using min heap
        for(int[] mat : matrix)
        {
            for(int num : mat)
            {
                pq.add(num);
            }
        }
        while(k > 1)
        {
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}
