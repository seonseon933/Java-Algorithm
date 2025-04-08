package Sliding_Window.p1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length;

public class p1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                cnt++;
            if (i >= k) {
                char prev = s.charAt(i - k);
                if (prev == 'a' || prev == 'e' || prev == 'i' || prev == 'o' || prev == 'u')
                    cnt--;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
