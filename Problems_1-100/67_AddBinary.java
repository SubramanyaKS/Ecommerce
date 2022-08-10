class Solution {
    public String addBinary(String a, String b) {
        StringBuilder r=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        while(i>=0||j>=0){
            sum/=2;
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            r.append(sum%2);
            i--;
            j--;
        
            
        }
        if(sum/2!=0){
            r.append(1);
        }
        return r.reverse().toString();
        
    }
}