package Two_Pointers.p283_Move_Zeroes;

public class p283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int p1 = 0, p2 = 0; // p1: 0의 위치
        while (p2 < nums.length) {
            if (nums[p2] != 0) {
                int tmp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tmp;
                p1++;
            }
            p2++;
        }
    }
}

/*
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * [0, 1, 0, 3, 12] p2+1 -> p2 = 1, p1 = 0
 * 
 * [1, 0, 0, 3, 12] p1, p2 swap -> p2 = 2, p1 = 1 -> 2번 0이니 p2만 +1. p2 = 3, p1 =
 * 1
 * 
 * [1, 3, 0, 0, 12] p1, p2 swap
 * 
 * [1, 3, 12, 0, 0]
 * 
 * Input: [4, 0, 5, 0, 0, 3, 0, 2]
 * Output: [4, 5, 3, 2, 0, 0, 0, 0]
 * 
 * [4, 0, 5, 0, 0, 3, 0, 2]
 * 
 * [4, 5, 0, 0, 0, 3, 0, 2]
 * 
 * [4, 5, 3, 0, 0, 0, 0, 2]
 * 
 * [4, 5, 3, 2, 0, 0, 0, 0]
 */