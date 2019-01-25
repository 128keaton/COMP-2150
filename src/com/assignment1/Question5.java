// kbrleson
// kbrleson@memphis.edu
// Jan 25th, 2019

package com.assignment1;

public class Question5 {
    // Two arrays with the given data
    private static final String[] NAME_ARRAY_1 = {"Michael", "JAVA", "Eriel", "Tanner", "Ben", "Charles"};
    private static final String[] NAME_ARRAY_2 = {"Micheal", "Ashlee", "Ben", "Rob", "Eriel", "Neil", "Tanner", "Keaton"};

    public static void main(String[] args) {
        System.out.println(getDuplicatedItems(NAME_ARRAY_1, NAME_ARRAY_2));
    }

    private static String getDuplicatedItems(String[] x, String[] y) {
        // Empty string to append to
        String dupedItems = "";

        // Loop through all the strings i in array x.
        for (String i : x) {
            // Uses the array contains method
            if (arrayContains(y, i)) {
                // Append the duplicated item to the dupedItems string
                dupedItems = dupedItems.concat(i + " ");
            }
        }

        return dupedItems.equals("") ? "No duplicated items" : dupedItems;
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
