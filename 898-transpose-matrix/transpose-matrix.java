class Solution {
    public int[][] transpose(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[m][n];

        for(int i = 0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                arr[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        
        return arr;
    }
 }
// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int row = matrix[0].length;
//         int colums = matrix.length;

//         int[][] result = new int[row][colums];

//         for(int i = 0; i < colums;i++){
//             for(int j = 0; j < row; j++){
//                 result[j][i] = matrix[i][j];
//             }
//         }
//         return result;
//     }
// }