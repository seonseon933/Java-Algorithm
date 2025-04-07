package Sliding_Window.p1208_Get_Equal_Substrings_Within_Budget;

public class p1208_Get_Equal_Substrings_Within_Budget {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int cnt = 0;
        int res = 0;
        int[] cost = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            cnt += cost[i];
            while (cnt > maxCost) {
                cnt -= cost[left++];
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
/*
 * s = abcd, t = bcdf, m = 3
 * -> a - b => 1 sum = 1
 * -> b - c => 1 sum = 2
 * -> c - d => 1 sum = 3
 * 
 */