class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String str = "";
        for(int i =0;i<n; i++ ){
       if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
       str += s.charAt(i); 
       }
        }
       str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
          if(str.charAt(i)!= str.charAt(str.length()-i-1))return false;
        }
        return true;
    }
}