class Solution {
    public int reverse(int x) {
        if(x>(Math.pow(2,32)-4)){
            return 0;
        }
        else{
        String s= Integer.toString(x);
        String r="";
        if(s.charAt(0)!='-'){
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            r=sb.toString();
        }
        else{
            s=s.substring(1);
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            r ="-"+sb.toString();
        }
            int p=0;
        try{
        p=Integer.parseInt(r);
        }
            catch(NumberFormatException e){
                return 0;
            }
        return p;
        }
        
    }
}