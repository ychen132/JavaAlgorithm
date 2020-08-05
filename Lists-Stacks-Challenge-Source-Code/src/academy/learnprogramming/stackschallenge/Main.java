package academy.learnprogramming.stackschallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> input = new LinkedList<Character>();
        StringBuilder StringWithNoPunctuation = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                StringWithNoPunctuation.append(c);
                input.push(c);
            }
        }
        StringBuilder StringReverse = new StringBuilder(input.size());
        while(!input.isEmpty()){
            StringReverse.append(input.pop());
        }

        return StringReverse.toString().equals(StringWithNoPunctuation.toString());
    }
}
