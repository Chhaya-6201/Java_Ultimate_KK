package Practice;
// One pass solution
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={10,-5,10};
        int ans=getSecondLargest(arr);
        System.out.println(ans);
    }
     static int getSecondLargest(int[] arr){

        int largest=-1;
        int secondLargest=-1;

        for(int num:arr){
            if (num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num<largest){
                secondLargest=num;
            }

        }
       return secondLargest;
     }


}

