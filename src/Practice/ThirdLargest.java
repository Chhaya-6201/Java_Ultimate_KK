package Practice;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,8,9};
        int ans=getThirdLargest(arr);
        System.out.println(ans);
    }

    static int getThirdLargest(int[] arr){
        int n=arr.length;
        int first=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first) {
                first = num;
            }
        }
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>second && num<first){
               second=num;
            }
        }
        int third=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>third && num<second){
                third=num;
            }
        }
        return third;
    }

}
