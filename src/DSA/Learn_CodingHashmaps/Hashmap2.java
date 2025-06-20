package DSA.Learn_CodingHashmaps;

import java.util.HashSet;
import java.util.Set;

/*
Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[]
is a subset of a[]. Both arrays are not sorted, and elements are distinct.
Examples:
Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1]
Output: true

Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4]
Output: true

Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3]
Output: false
 */
/*
[Naive approach] Using Nested Loops – O(m*n) Time and O(1) Space
The very basic approach is to use two nested loops: the outer loop picks each element from b[], and the
inner loop searches for this element in a[] and check for all elements in b[].
 */
public class Hashmap2 {
    public static void main(String[] args) {
        int[] a= { };int[] b = { };
        if(isSubset(a,b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    /*static boolean isSubset(int[] a,int[] b){
        //Iterate over each element in the bigger array
        int m=a.length;
        int n=b.length;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(b[i]==a[j]){
                    found=true;
                    break;
                }
            }
            //if any element is not found return false
            if(!found){
                return false;
            }
        }
      // if all the elements are found, return true
        return true;
     */



    /*
    [Expected Approach] Using Hashing- O(m + n) Time and O(m) Space
    We can use a hash set to store elements of a[], this will help us in constant time
    complexity searching. We first insert all elements of a[] into a hash set. Then, for each element
    in b[], we check if it exists in the hash set.
     */


    static boolean isSubset(int[] a,int[] b){
        //Create a hashset and insert all the elements of a
        Set<Integer> hasSet=new HashSet<>();
        for(int num:a){
            hasSet.add(num);
        }
        //Check each element of b in the hashset
        for(int num:b){
            if(!hasSet.contains(num)){
                return false;
            }
        }
        // if all the elements of b are found in the hashSet
        return true;
    }
}
/*
Time Complexity: O(m + n), where m and n are the size of a and b respectively.
Auxiliary Space: O(m)
 */