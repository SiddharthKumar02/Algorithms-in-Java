/**
 ** Java Program to Implement Quick Sort
 **/
 
import java.util.Scanner;
 
/** Class QuickSort **/
public class QuickSort 
{
    /** Quick Sort function **/
    public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    /** Quick sort function **/
    public static void quickSort(int arr[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) 
            {
                /** swap **/
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
            }
        }
 
        /** recursively sort lower half **/
        if (low < j)
            quickSort(arr, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSort(arr, i, high);
    }
    /** Main method **/
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Quick Sort Test\n");
        int n, i;
        /** Accept number of elements **/
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
        /** Create array of n elements **/
        int arr[] = new int[ n ];
        /** Accept elements **/
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /** Call method sort **/
        sort(arr);
        /** Print sorted Array **/
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}
