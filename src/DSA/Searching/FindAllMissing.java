package DSA.Searching;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            // just find missing numbers
           List<Integer> ans=new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    ans.add(index+1);
                }
            }
            return ans;
        }
        static void swap(int[] nums,int first, int second){
            int temp=nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
        }

    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,8};
        List<Integer> ans= findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    }

