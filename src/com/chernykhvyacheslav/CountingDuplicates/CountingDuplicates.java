package com.chernykhvyacheslav.CountingDuplicates;

import java.util.HashSet;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String lowerCaseText = text.toLowerCase();
        HashSet<Character> result = new HashSet<>();
        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (i < lowerCaseText.lastIndexOf(lowerCaseText.charAt(i))) {
                result.add(lowerCaseText.charAt(i));
            }
        }
        return result.size();
    }
}
