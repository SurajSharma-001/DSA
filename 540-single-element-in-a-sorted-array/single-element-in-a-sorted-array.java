class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }else if(nums[0]!=nums[1]){
            return nums[0];
        }else if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int lo = 1;
        int hi = nums.length-2;

        while(lo<=hi){

            int mid = lo+(hi-lo)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                lo = mid+1;
            }else{
                hi = mid-1;
            }

        }

        return -1;
        
    }
}