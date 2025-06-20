package Learn_Coding.Arrays;
//Given an array of positive integers arr[] of size n, the task is to find second-largest distinct element in the array.
//Note: If the second largest element does not exist, return -1

import java.util.Arrays;

/*
[Naive Approach] Using Sorting
The idea is to sort the array in non-decreasing order. Now, we know that the largest
element will be at index n – 1. So, starting from index (n – 2), traverse the remaining array in
reverse order. As soon as we encounter an element which is not equal to the largest element, return it
as the second largest element in the array. If all the elements are equal to the largest element, return -1.
 */
public class SecondLargestElement {
//    public static void main(String[] args) {
//        // does not  work for negative numbers too => will return -1
//       // int[] nums={10,-5,10}
//        int[] nums={12, 35, 1, 10, 34, 1};
//        int ans=secondLargest(nums);
//        System.out.println(ans);
//
//    }
//    static int secondLargest(int[] arr){
//        Arrays.sort(arr);
//        int n=arr.length;
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]!=arr[n-1]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

    /*Time Complexity: O(n*log(n)), as sorting the array takes O(n*log(n)) time and
     traversing the array can take O(n) time in the worst case, so total
     time complexity = (n*log(n) + n) = O(n*log(n)).
    Auxiliary space: O(1), as no extra space is required.*/

/*[Better Approach] Two Pass Search
The approach is to traverse the array twice. In the first traversal, find the maximum element.
 In the second traversal, find the maximum element
 ignoring the one we found in the first traversal./*

    /*
    class GfG {

    // Function to find the second largest element in the array
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Finding the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        // Finding the second largest element
        for (int i = 0; i < n; i++) {

            // Update second largest if the current element is greater
            // than second largest and not equal to the largest
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}
 */

    /*
    Time Complexity: O(2*n) = O(n), as we are traversing the array two times.
    Auxiliary space: O(1), as no extra space is required.
     */

    /* [Expected Approach] One Pass Search
    The idea is to keep track of the largest and second-largest element while traversing the array.
    Initialize largest and secondLargest with -1. Now, for any index i,
    If arr[i] > largest, update secondLargest with largest and largest with arr[i].
     Else If arr[i] < largest and arr[i] > secondLargest, update secondLargest with arr[i].
     */

    public static void main(String[] args) {
       int[] nums={-5,10};
       int ans=getSecondLargest(nums);
        System.out.println(ans);
    }

     static int getSecondLargest(int[] arr) {
         int n = arr.length;
         int largest = -1;
         int secondLargest = -1;

         for( int i = 0; i < n; i++) {
             if (arr[i] > largest) {
                 secondLargest=largest;
                 largest=arr[i];
             }
             else if (arr[i] > secondLargest && arr[i] < largest) {
                 secondLargest = arr[i];
             }
         }
         return secondLargest;

     }

}
/*
Time Complexity: O(n), as we are traversing the array only once.
Auxiliary space: O(1
 */