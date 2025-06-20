package DSA.Arrays;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
       return i;
    }
    static void swap(int[] nums,int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,12,34,1};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
}
