class Solution {
    int sum(int i, int num){
        int temp = num;
        int sum  = 0;
        while(temp > 0){
                int d = temp % 10;
                if(i == 1){
                    sum += d;
                }
                else{
                    sum -= d;
                }
                i = i ^ 1;
                temp = temp / 10;
            }
            return sum;
    }
    public int alternateDigitSum(int n) {
        int len = (int)(Math.log10(n)) + 1;
        int temp = n , sum = 0;
        if(len % 2 == 0){
            sum = sum(0 , n);
        }
        else{
            sum = sum(1 , n);
        }
        return sum;
    }
}