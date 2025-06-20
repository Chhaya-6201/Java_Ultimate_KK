package DSA;
//Binary search Iterative method

/*Binary search is a searching technique. Binary Search follows divide and conquer method i.e. if the
size of the problem is large we divide the problem into sub problems and sub-sub problems . once the sub-sub problems
 and sub problems are solved we combine them to get the solution for the main problem */

// First all the elements must be in sorted order, then only you can perform binary search
/*
int binarySearch(Arr, n, Key)
{
l=1;h=n;
while(l<=h){
mid=l+h/2;
if(key==Arr[mid]){
return mid;
}
if else(key<Arr[mid]){
h=mid-1;
}
else {
l=mid+1;
}
}
return 0;}
 */
public class BinarySearch {
    public static void main(String[] args) {
     int[] arr={34, 56,45, 67,89,100};
     int target=89;
     int ans=binarySearch(arr,target);
     System.out.println(ans);
    }


    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return 0;
    }
}

