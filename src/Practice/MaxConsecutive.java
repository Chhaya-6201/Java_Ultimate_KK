package Practice;

public class MaxConsecutive {
    public static void main(String[] args) {
    int[] arr={1,1,1,1,1,1,1};
    int ans=maxCountConsecutive(arr);
        System.out.println(ans);
    }
    static int maxCountConsecutive(int[] arr){
        int maxCount=0;
        int count=0;
        int prev=-1;
        if(arr.length==0){
            return 0;
        }
       for(int i=1;i<arr.length;i++){
           if((prev^arr[i])==0){
               count++;
           }
           else{
               maxCount=Math.max(maxCount,count);
               count=1;
           }
           prev=arr[i];
       }

       return Math.max(maxCount,count);
    }


}
