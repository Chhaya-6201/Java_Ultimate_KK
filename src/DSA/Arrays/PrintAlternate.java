
/*
Alternate elements of an array
Given an array arr[], the task is to print every alternate element of the array starting
from the first element.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: 10 30 50
Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).


Input: arr[] = [-5, 1, 4, 2, 12]
Output: -5 4 12
 */

package DSA.Arrays;
import java.util.ArrayList;

/*
Iterative Approach
The idea is to start iterating from index 0, print the element at that index, and then
increment the index by 2 to move to the next alternate element.
Keep on printing the elements till we reach the end of the array.


// public class PrintAlternate {
//
//     static ArrayList<Integer> getAlternates(int[] arr){
//         ArrayList<Integer> res=new ArrayList<>();
//         for(int i=0;i<arr.length;i=i+2){
//             res.add(arr[i]);
//         }
//        return res;
//
//     }
//
//     public static void main(String[] args) {
//     int[] arr={0,1,2,3,4,5,6,7,8,9};
//     ArrayList<Integer> ans=getAlternates(arr);
//     for(int x:ans){
//         System.out.print(x+" ");
//     }
//     }
//
// }


Time Complexity: O(n), where n is the number of elements in arr[].
Auxiliary Space: O(1)
 */


/*
Recursive Approach
We can also print the alternate elements using recursion. We start from index = 0,
that is the first element of the array and print its value. We then call the recursive function
again with the (index + 2) as the current index.
 */

public class PrintAlternate{

    static void getAlternateRec(int[] arr,int idx,ArrayList<Integer>res){
          if(idx<arr.length) {
              res.add(arr[idx]);
              getAlternateRec(arr, idx + 2, res);
          }
    }
    static ArrayList<Integer> getAlternates(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        getAlternateRec(arr,0,res);
        return res;

    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
       ArrayList<Integer> ans=getAlternates(num);
       for(int x:ans){
           System.out.print(x+" ");
       }
    }

}