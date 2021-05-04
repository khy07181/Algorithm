package level1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if(set.size() > nums.length / 2) {
            return nums.length / 2;
        }

        return set.size();
    }
}
