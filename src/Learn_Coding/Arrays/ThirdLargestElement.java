package Learn_Coding.Arrays;

/*
Using Three Loops – O(n) time and O(1) space
The idea is to iterate the array twice and mark the maximum and
second maximum element and then excluding them both find the third maximum element, i.e.,
the maximum element excluding the maximum and second maximum.


Step by step approach:

First, iterate through the array and find maximum.
Store this as first maximum along with its index.
Now traverse the whole array finding the second max, excluding the maximum element.
Finally traverse the array the third time and find the third largest element i.e., excluding the maximum and second maximum.
 */

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] nums={1, 2,3,4,5,67,8,9};
        int ans=getThirdLargest(nums);
        System.out.println(ans);

    }

    static int getThirdLargest(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        int third=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<second && arr[i]>third){
                third=arr[i];
            }
        }
      return third;
    }

}
