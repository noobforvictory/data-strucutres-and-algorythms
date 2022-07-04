class Solution {
    public void setZeroes(int[][] matrix) {
    
        
	 boolean row=false;
     boolean column= false;
     int n = matrix.length;
     int m = matrix[0].length;
     for(int i=0; i<m; i++){

     if(matrix[0][i]==0){
         row =true;
     }
     }
     for(int i=0; i<n; i++){
         if(matrix[i][0]==0){

         column=true;
         }
     }
     for(int i=0; i<n; i++){

     for(int j=0; j<m; j++){
         if(matrix[i][j]==0){
             matrix[i][0]=0;
             matrix[0][j]=0;
         }
     }
     }
     for(int i=0; i<n; i++){

     if(matrix[i][0]==0){
     for(int j=0; j<m; j++){
        if(i!=0 && j!=0) matrix[i][j]=0;
     }}}
         for(int i=0; i<m; i++){
         if(matrix[0][i]==0){
             for(int j=0; j<n; j++){
                 if(i!=0 && j!=0)matrix[j][i]=0;
             }
         }
     
     
     }
     if(row==true){
         for(int i=0; i<m; i++){
             
             matrix[0][i]=0;
         }
     }
     if(column==true){
         for(int i=0; i<n; i++){

         matrix[i][0]=0;
         }
     }
    }
}