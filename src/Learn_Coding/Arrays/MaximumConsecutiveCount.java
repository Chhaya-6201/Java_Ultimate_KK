package Learn_Coding.Arrays;
/*
Maximum consecutive one’s (or zeros) in a binary array
Given an array arr[] consisting of only 0’s and 1’s, the task is to find the count of a maximum
number of consecutive 1’s or 0’s present in the array.

Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 8-11.
*/

/*
Using Simple Traversal – O(n) Time and O(1) Space
The idea is to traverse the array while keeping track of the current streak of consecutive 1s or 0s. If the sequence is broken, update the maximum count and reset the current count.

Steps to implement the above idea:

Initialize maxCount and count to 0 and track the previous element.
Traverse the list, increment count if the current element matches previous, else update maxCount and reset count.
Update previous to the current element in each iteration.
Return the maximum of maxCount and count at the end.
*/

public class MaximumConsecutiveCount {
  /*  public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1};
        int ans=maxConsecutiveCount(nums);
        System.out.println(ans);
    }
    static int maxConsecutiveCount(int[] arr){
          if(arr.length==0){
              return 0;
          }
          int maxCount=0; int count=1;
          for(int i=1;i<arr.length;i++) {
              if (arr[i] == arr[i - 1]) {
                 count++;
              } else {
               maxCount=Math.max(maxCount,count);
               count=1;
              }
          }
        return Math.max(maxCount,count);
    }

   */

    /*
   Using Bit Manipulation – O(n) Time and O(1) Space
   The idea is to use XOR (^) to check if consecutive elements are the same. If prev ^ num == 0,
   the sequence continues; otherwise, reset the count.


   Steps to implement the above idea:

   Initialize maxCount, count, and set previous to -1.
   Traverse the list, use XOR (^) to check if the current element matches previous.
   If the result is 0, increment count; otherwise, update maxCount and reset count.
   At the end, return the maximum of maxCount and count*/
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1};
        int ans=maxConsecutiveCount(nums);
        System.out.println(ans);
    }

    static int maxConsecutiveCount(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxCount = 0;
        int count = 0;
        int prev = -1;
        for (int num : arr) {
            if ((prev ^ num) == 0) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
            prev = num;
        }
        return Math.max(maxCount,count);

    }
}
