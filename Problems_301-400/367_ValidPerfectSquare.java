class Solution {
    public boolean isPerfectSquare(int num) {
        long sum=0;
        long i=1;
        while(sum<num){
            sum+=i;
            if(sum==num)
                return true;
            i+=2;
        }
        return false;
        
    }
}
