class Solution {
    public boolean isValid(String s) {
        Stack<Character> b= new Stack<>();
        for(char c:s.toCharArray()){
            switch(c){
                case '(': b.push(c);
                          break;
                case '[': b.push(c);break;
                case '{': b.push(c);break;
                case ')': if (b.empty() || b.peek()!='(') return false; else b.pop(); break;
                case '}': if (b.empty() || b.peek()!='{') return false; else b.pop(); break;
                case ']': if (b.empty() || b.peek()!='[') return false; else b.pop(); break;
                default: ;
                    
                
            }
        }
        return b.isEmpty();
    }
}