//Time complexity: O(n)
//Space complexity: O(1)

class Solution{
    public double calculateTax(int[][] brackets, int income){
        double ans = 0;
        if(brackets[0][0]>income) return (double) income * brackets[0][1] / 100;
        ans += (double) brackets[0][0] * brackets[0][1] / 100;
        for(int i=1; i<brackets.length; i++){
            if(brackets[i][0]<=income) ans += (double) (brackets[i][0]-brackets[i-1][0]) * brackets[i][1] / 100;
            else{
                ans += (double) (income-brackets[i-1][0]) * brackets[i][1] / 100;
                break;
            }
        }
        return ans;
    }
}