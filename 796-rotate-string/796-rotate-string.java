class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
	       String newString ="";
	        newString = goal + goal;
	        if(newString.contains(s))return true;
	        else return false;
        
    }
}