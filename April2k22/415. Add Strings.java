class Solution {
    public String addStrings(String num1, String num2) {
        String s1 = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder input1 = new StringBuilder();
        while(i>=0||j>=0)
        {
            int sum = carry;
            if(i>=0)
            sum += (num1.charAt(i) - '0');
            if(j>=0)
            sum += (num2.charAt(j) - '0');
            carry = sum/10;
            input1.append(sum%10);
            i--;
            j--;
        }
        if(carry > 0)
        {
            input1.append(carry);
        }
        input1.reverse();
        return input1.toString();
    }
}
