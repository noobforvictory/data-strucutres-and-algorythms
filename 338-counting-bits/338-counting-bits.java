class Solution {
    public int[] countBits(int n) {
       int []arr= new int [n+1];
        int count =0;
        for(int i=0; i<=n; i++){
for(int j=0; j<32; j++){
    int bitMask = 1<<j;
    if((bitMask & i) != 0)count++;
             }
           arr[i]=count;
           count =0;
           
           
         }
        return arr;
    }
  
}