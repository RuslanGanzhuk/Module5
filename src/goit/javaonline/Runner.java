package goit.javaonline;

import goit.javaonline.sortArray.SortArray;
import java.util.Arrays;

public class Runner {

    public static void main(String[] arg) {

        int[] array = SortArray.createArray();

        System.out.println("Not sorted array : " + Arrays.toString(array));
        System.out.println("Min element is " + SortArray.searchMinElement(array));
        System.out.println("Max element is " + SortArray.searchMaxElement(array));
        Arrays.sort(array);
        System.out.println("Sorted array is:" + Arrays.toString(SortArray.sortArrayBubble(array)));
    }
}

/*
Arrays.sort(array) - зачем нам эта строчка, если задача реализовать сортировку? Что если ее закоментировать?
*/
