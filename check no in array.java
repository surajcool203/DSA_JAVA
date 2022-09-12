class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length-1;
        for(int i=0;i<=l;i++)
        {
            if( target == nums[i] )
                return i;
        }
        return -1; 
    }
}