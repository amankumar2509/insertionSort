/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 05-05-2021
 *   Time: 17:50
 *   File: Main.java
 */


public class Main {
    public static void main(String[] args) {
        int[] array={2,4,6,7,5};
        InsertionSort sort=new InsertionSort();
        sort.insertionSort(array);
        System.out.println("sorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
