class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int st = 0, end = s.length()-1;
        int i = 0;
        while(st<=end)
        {
            char cst = s.charAt(st);
            char cend = s.charAt(end);
            if(cst!='a'&&cst!='e'&&cst!='i'&&cst!='o'&&cst!='u'&&
              cst!='A'&&cst!='E'&&cst!='I'&&cst!='O'&&cst!='U')
            {
                st++;
            }
            if(cend!='a'&&cend!='e'&&cend!='i'&&cend!='o'&&cend!='u'&&
              cend!='A'&&cend!='E'&&cend!='I'&&cend!='O'&&cend!='U')
            {
                end--;
            }
            
           if((cst=='a'||cst=='e'||cst=='i'|| cst=='o'||cst=='u'||
              cst=='A'||cst=='E'||cst=='I'|| cst=='O'||cst=='U') &&                                                 (cend=='a'||cend=='e'||cend=='i'||cend=='o'||cend=='u'||
               cend=='A'||cend=='E'||cend=='I'|| cend=='O'||cend=='U'))
           {
               ans[st] = cend;
               ans[end] = cst;
               end--;
               st++;
               
           }
        }
        return String.valueOf(ans);
    }
}