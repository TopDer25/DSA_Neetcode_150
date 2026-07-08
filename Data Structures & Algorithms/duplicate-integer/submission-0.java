class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupli= new HashSet<>();
        
        for(int i =0; i<nums.length;i++){
            
            if(dupli.contains(nums[i]))
            {
                 return true;
               
            }
            dupli.add(nums[i]);
        }
         return false;
    }
}