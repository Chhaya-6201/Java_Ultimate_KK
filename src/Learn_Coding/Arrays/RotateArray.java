package Learn_Coding.Arrays;
/*
Given an array of integers arr[] of size n, the task is to rotate the array
elements to the left by d positions.

Examples:

Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and
 after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}
 */
public class RotateArray {

    public static void main(String[] args) {
    int[] arr={1,2,3};
    int d=4;
    rotateArr(arr,d);
    for(int num:arr) {
        System.out.print(num+" ");
    }
    }

    static void rotateArr(int[] arr ,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr,int start, int end ){
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
             start++;
             end--;
       }
    }
}
/*
Using Reversal Algorithm – O(n) Time and O(1) Space
The idea is based on the observation that if we left rotate the array by d positions, the last (n – d) elements will be at the front
and the first d elements will be at the end.
Reverse the subarray containing the first d elements of the array.
Reverse the subarray containing the last (n – d) elements of the array.
Finally, reverse all the elements of the array.
 */
/*
Time complexity: O(n), as we are visiting each element exactly twice.
Auxiliary Space: O(1)
 */