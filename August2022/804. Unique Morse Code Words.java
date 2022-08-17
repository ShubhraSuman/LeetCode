class Solution {
    String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        int numOfWords = words.length;
        if(numOfWords == 1)
            return 1;
        Set<String> transformation = new HashSet<String>();
        for(int i = 0;i<numOfWords; i++)
        {
            String s1 = words[i];
            // System.out.println(s1);
            String ans = "";
            for(int j = 0; j<s1.length(); j++)
            {
                // System.out.println(s1.charAt(j)-'a');
                ans += arr[s1.charAt(j) - 'a'];
            }
            transformation.add(ans);
        }
        return transformation.size();
    }
}
