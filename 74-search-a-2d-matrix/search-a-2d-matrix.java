class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Map 1D index back to 2D matrix indices
            int row = mid / n;
            int col = mid % n;

            int midVal = matrix[row][col];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

//  Staircase search from a matrix corner is O(m + n) and is explicitly prohibited by 
//  the restrictions.

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {

//         int row = 0;
//         int col = matrix[0].length - 1;

//         while (row < matrix.length && col >= 0) {

//             if (matrix[row][col] == target) {
//                 return true;
//             } else if (matrix[row][col] > target) {
//                 col--;
//             } else {
//                 row++;
//             }

//         }

//         return false;

//     }
// }