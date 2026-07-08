class Solution {
    public int[][] transpose(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[m][n];

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = matrix[j][i];
            }
            System.out.println();
        }
        
        return arr;
    }
}