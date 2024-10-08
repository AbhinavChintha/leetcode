class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int n=matrix.length;
       int m=matrix[0].length;
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        while(left<=right && top <=bottom){
        for(int i=left;i<=right;i++){
            a.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            a.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            a.add(matrix[bottom][i]);
        }
        }
        bottom--;
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            a.add(matrix[i][left]);
        }
        }
        left++;
    }
    return a;
    }
}