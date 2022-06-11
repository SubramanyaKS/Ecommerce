class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        String s1=sb.toString();
        if(s.equals(s1)==true){
            return true;
        }
        else{
            return false;
        }
        
    }
}
