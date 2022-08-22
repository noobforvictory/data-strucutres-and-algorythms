class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length ==0 )return prefix;
        for(int i =0; i<strs[0].length(); i++){

        char character = strs[0].charAt(i);
            for(int j =0; j<strs.length; j++){
           if(i>=strs[j].length())return prefix;
            if(character != strs[j].charAt(i)){
                return prefix;
            }
            }
           prefix += character;
            
            }
        return prefix;
        }
        
    
}