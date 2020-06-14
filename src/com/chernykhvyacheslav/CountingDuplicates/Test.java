package com.chernykhvyacheslav.CountingDuplicates;

public class Test {
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcde")); // 0
        System.out.println(CountingDuplicates.duplicateCount("aabbcde")); // 2 - a and b
        System.out.println(CountingDuplicates.duplicateCount("aabBcde")); // 2 - a and b
        System.out.println(CountingDuplicates.duplicateCount("indivisibility")); // 1 - i
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities")); // 2 - i and s
        System.out.println(CountingDuplicates.duplicateCount("aA11")); // 2 - a and 1
        System.out.println(CountingDuplicates.duplicateCount("ABBA")); // 2 - A and B
    }
}
