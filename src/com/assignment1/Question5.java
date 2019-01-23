package com.assignment1;

public class Question5 {
    private static final String[] NAME_ARRAY_1 = {"Michael", "JAVA", "Eriel", "Tanner", "Ben", "Charles"};
    private static final String[] NAME_ARRAY_2 = {"Micheal", "Ashlee", "Ben", "Rob", "Eriel", "Neil", "Tanner", "Keaton"};

    public static void main(String[] args) {
        System.out.println(getDuplicatedItems(NAME_ARRAY_1, NAME_ARRAY_2));
    }

    private static String getDuplicatedItems(String[] x, String[] y) {
        String dupedItems = "";

        // Loop through all the strings i in array x.
        for (String i : x) {
            // Uses the array contains method
            if (arrayContains(y, i)) {
                dupedItems = dupedItems.concat(i + " ");
            }
        }

        return dupedItems;
    }

    private static boolean arrayContains(String[] a, String b) {
        for (String i : a) {
            if (i.equals(b)) {
                return true;
            }
        }
        return false;
    }
}
