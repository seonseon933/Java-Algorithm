package Prefix_Sum.p1732_Find_the_Highest_Altitude;

public class p1732_Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr = 0;
        for (int i : gain) {
            curr += i;
            max = Math.max(max, curr);
        }
        return max;
    }
}
