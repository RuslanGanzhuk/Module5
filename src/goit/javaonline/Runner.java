package goit.javaonline;

import java.io.PrintStream;
import java.util.Arrays;

import static goit.javaonline.SortArray.*;


public class Runner {

    public static void main(String[] arg) {

        int[] array = SortArray.createArray();

        System.out.println("Min element is " + SortArray.searchMinElement(array));
        System.out.println("Max element is " + SortArray.searchMaxElement(array));
        System.out.println("Sorted array is:" + SortArray.sortArrayBubble(array));

    }
}

