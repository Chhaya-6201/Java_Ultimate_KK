/*
Linear Search Algorithm
Given an array, arr of n integers, and an integer element x, find whether element x is present in the
array. Return the index of the first occurrence of x in the array, or -1 if it doesn’t exist.

Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3.
Since 3 is present at index 2, the output is 2.

Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
Explanation: For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4.
So, the output is 4.
 */

/*
In Linear Search, we iterate over all the elements of the array and check if if the
current element is equal to the target element. If we find any element to be equal to the target
element, then return the index of the current element. Otherwise, if no element is equal to the target
element, then return -1 as the element is not found. Linear search is also known as sequential search.

 */
package Learn_Coding.Arrays;

public class LinearSearch {

 static int search(int[] arr , int target){
     for(int i=0;i<arr.length;i++){
         if(target==arr[i]){
             return i;
         }
     }
    return -1;
}
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8,9};
      int target=0;
      int ans=search(arr,target);
        System.out.println(ans);
    }
}
/*
The time complexity of linear search algorithm is O(n), where n is the number of elements
in the list or array being searched. This means the time taken for searching increases linearly
with the size of the input.


 */