/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar (amankumar_2509)
 *   Date: 05-05-2021
 *   Time: 17:24
 *   File: InsertionSort.java
 */


public class InsertionSort {
    public void insertionSort(int[] array){
        int n=array.length;
        for (int i = 0; i <n ; i++) {
            int temp=array[i];
            int j=i-1;
            while (j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }

}
