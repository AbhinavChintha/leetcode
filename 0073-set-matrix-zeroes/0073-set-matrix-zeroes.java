class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0){
                markrow(i,matrix);
                markcol(j,matrix);
               }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]=='A'){
                    matrix[i][j]=0;
                }
            }
        }
    }
    static void markrow(int i,int[][] matrix){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]='A';
            }
        }
    }
    static void markcol(int j,int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]='A';
            }
        }
    }
}