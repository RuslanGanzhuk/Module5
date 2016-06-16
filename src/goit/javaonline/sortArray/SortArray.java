package goit.javaonline.sortArray;

import java.util.Arrays;

public class SortArray {

    public static int[] createArray() {

         int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100) ;
        }

      return arr;
    }

    public static int searchMaxElement(int[] arr) {

        int maxElement = 0;

        for (int i:arr) {
            maxElement = i;
              for (int j:arr) {
                  if (maxElement < j) {
                      maxElement = j;
                  }
              }
        }

        return maxElement;
    }

    public static int searchMinElement(int[] arr) {
        
        int minElement = 0;

        for (int i:arr) {
            minElement = i;
            for (int j:arr) {
                if (minElement > j) {
                    minElement = j;
                }
            }
        }

        return minElement;
    }

    public static int[] sortArrayBubble(int[] arr) {

        for (int i = 0; i > arr.length - 1; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j-1] < arr[j]) {
                    int k = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = k;
                }
            }
        }

        return arr;
    }
}

/*
java.util.Arrays - ненужный импорт

Что с отступами в началах строк? Что с отступами вокруг арифметических знаков?

Какое отношение имеет метод searchMaxElement() к классу SortArray? Плохое название классу

*/
