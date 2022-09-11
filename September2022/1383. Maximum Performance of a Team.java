class Solution {
    class Engineer{
        private int speed;
        private int efficiency;
        public Engineer(int speed, int efficiency)
        {
            this.speed = speed;
            this.efficiency = efficiency;
        }    
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        List<Engineer> engineers = new ArrayList<>();
        
        for(int i = 0;i<n;i++)
        {
            engineers.add(new Engineer(speed[i],efficiency[i]));
        }
        
        //sorting engineers list by descending order
        engineers.sort((a,b) -> b.efficiency - a.efficiency);
        
        PriorityQueue<Engineer> pq = new PriorityQueue<>((a,b) -> a.speed - b.speed);
        
        long teamSpeed = 0;
        long maxPerformance = 0;
        
        for(Engineer newHire: engineers)
        {
            if(pq.size()==k)
            {
                Engineer slowEmployee = pq.poll();
                teamSpeed -= slowEmployee.speed;
            }
            pq.add(newHire);
            teamSpeed += newHire.speed;
            long perf = teamSpeed * newHire.efficiency;
            maxPerformance = Math.max(perf,maxPerformance);
        }
        return (int)(maxPerformance%1000000007);
    }
}

// Performance = sum of k engineers speed * min(k,k-1,....)
/* 
2 -> 5
10 -> 4
3 -> 3
1 -> 9
5 -> 7
8 -> 2

based on efficiency sort
2 -> 8
3 -> 3
4 -> 10
5 -> 2
7 -> 5
9 -> 1

max efficiency = 7
max speed = 5
5+10 * (7,4) = 15*4 = 60
efficiency => the ratio of the useful work performed by a machine
ex: 2 
[2,10,3,1,5,8], efficiency = [5,4,3,9,7,2],
5 2
4 10
3 3
9 1
7 5
2 8
low efficiency = 2
low speed = 1


 
*/
