class Solution {
    public int maximumCount(int[] nums) {

        int negLastIdx = negLast(nums) +1;
        int posFirstIdx = nums.length - posFirst(nums);

        if(negLastIdx > posFirstIdx){
            return negLastIdx;
        }else{
            return posFirstIdx;
        }
        
    }

    public static int negLast (int[] arr){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid]<0){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
           
        }
         return ans;
    }

    public static int posFirst (int[] arr){
        int ans = arr.length;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid]>0){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }

        }
        return ans;
    }
}