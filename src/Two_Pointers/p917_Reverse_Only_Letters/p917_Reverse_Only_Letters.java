package Two_Pointers.p917_Reverse_Only_Letters;

public class p917_Reverse_Only_Letters {
    public String reverseOnlyLetters(String s) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = new char[s.length()];
        int p1 = 0;
        int p2 = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            if ((arr1[i] >= 65 && arr1[i] <= 90) || (arr1[i] >= 97 && arr1[i] <= 122)) {
                arr2[p1++] = arr1[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] >= 65 && arr1[i] <= 90) || (arr1[i] >= 97 && arr1[i] <= 122)) {
                arr1[i] = arr2[p2++];
            }
        }

        return new String(arr1);
    }

}