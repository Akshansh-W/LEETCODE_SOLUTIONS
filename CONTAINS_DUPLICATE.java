import java.util.HashSet;
class CONTAINS_DUPLICATE {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i])==false){
                return true;
            }
        }
        return false;
    }
}