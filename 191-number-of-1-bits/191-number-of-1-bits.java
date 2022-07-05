public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0; i<32; i++){

        int bitMask= 1<<i;
            if((bitMask & n)!=0) count++;
            }
        return count;
            
    }

}