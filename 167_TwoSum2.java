class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k= numbers.length;
        int res[]=new int[2];
        int j=0;
        for(int i=0;i<k;i++){
            j=i+1;
            while(j<k){
            //for(int j=i+1;j<k;j++){
                if(numbers[i]+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                }
                j++;
            }
        }
        return res;
    }
}
