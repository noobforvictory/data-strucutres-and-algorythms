class Solution {
    public int[][] transpose(int[][] matrix) {
       int c = matrix[0].length;
        int r = matrix.length;
        int[][] newArr= new int[c][r];
        for(int i=0; i<c; i++){
        for(int j=0; j<r; j++){

        newArr[i][j] = matrix[j][i];
        }
        }
        return newArr;
    }
}