package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] arr={9,4,7,2,3,23,1,0,14};
     selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr, last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    //int start tha yha
    static int getMaxIndex(int[] arr, int end){
        int max= 0;
        for(int i = 0; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }




}
