import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int seq = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    seq++;
                }

                maxLen = Math.max(maxLen, seq);
            }
        }

        return maxLen;
    }
}