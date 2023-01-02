class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[] = s.split(" ");
        if(a.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> h = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            char c= pattern.charAt(i);
            if(h.containsKey(c)){
                String v= h.get(c);
                if(!v.equals(a[i])){
                    return false;
                }
            }
            else if(h.containsValue(a[i])){
                return false;                
            }
            h.put(c,a[i]);
        }
        return true;
    }
}