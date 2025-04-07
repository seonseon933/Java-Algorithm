package Two_Pointers.p557_Reverse_Words_in_a_String_III;

public class p557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                int right = i - 1;
                while (left < right) {
                    char tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;

                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
        return new String(arr);
    }
}