package org.launchcode.java.exercise2;

import java.util.Arrays;

public class Controlflow {
    public static void main(String [] args) {
        int nums[] = {1, 3, 5, 7, 9};

        for (int i : nums) {
            System.out.println(i);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.toString(nums));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }


}
