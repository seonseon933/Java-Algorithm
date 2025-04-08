package Two_Pointers.p2540_Minimum_Common_Value;

public class p2540_Minimum_Common_Value {
    public int getCommon(int[] nums1, int[] nums2) {
        int p1 = 0, p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2])
                return nums1[p1];
            else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                p1++;
            }
        }
        return -1;
    }
}
/*
 * [4,6], [1,2,3,4] -> 4, 1로 p1 > p2이니 p2++.
 */