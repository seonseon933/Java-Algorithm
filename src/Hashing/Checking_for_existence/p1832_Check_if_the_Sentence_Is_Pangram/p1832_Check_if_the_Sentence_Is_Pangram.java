package Hashing.Checking_for_existence.p1832_Check_if_the_Sentence_Is_Pangram;

import java.util.HashSet;

public class p1832_Check_if_the_Sentence_Is_Pangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26)
            return false;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!set.contains(c))
                return false;
        }

        return true;
    }
}