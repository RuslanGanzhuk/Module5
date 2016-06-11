package goit.javaonline;

import java.util.Arrays;

/**
 * Created by Родион on 11.06.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        System.out.println("Отсортированый массив :");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Минимальный элемент массива : " + arr[0]);
        System.out.println("Максимальный элемент массива :" + arr[9]);








    }

}
