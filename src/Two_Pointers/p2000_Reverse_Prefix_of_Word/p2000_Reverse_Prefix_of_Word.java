package Two_Pointers.p2000_Reverse_Prefix_of_Word;

public class p2000_Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            if (arr[right] == ch) {
                while (left < right) {
                    char tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                    right--;
                }
                return new String(arr);
            }
            right++;
        }
        return word;
    }
}