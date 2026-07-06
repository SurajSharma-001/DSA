class Solution {
    public int[] searchRange(int[] nums, int target) {

        int lo = 0;
        int hi = nums.length-1;
        int findex = -1;
        int lindex = -1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(nums[mid]>target) hi = mid-1;

            else if(nums[mid]<target) lo = mid+1;

            else{
                findex = mid;
                hi = mid-1;
            }
        }

        lo = 0;
        hi = nums.length-1;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(nums[mid]>target) hi = mid-1;

            else if(nums[mid]<target) lo = mid+1;

            else{
                lindex = mid;
                lo = mid+1;
            }
        }
        
        int[] arr = new int[2];

        arr[0] = findex;
        arr[1] = lindex;

        return arr;

    }
}