package Two_Pointers.p344_reverse_string;

public class p344_reverse_string {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp;
        while (left < right) {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }
    }
}
