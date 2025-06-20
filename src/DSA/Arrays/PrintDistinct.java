package DSA.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDistinct {

    static ArrayList<Integer> getDistinct(int[] arr){
        HashSet<Integer> st=new HashSet<>();
        for(int num:arr){
            st.add(num);
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int[] arr={ 10, 10, 10};
        ArrayList<Integer> res=getDistinct(arr);
        for(int x:res){
            System.out.print(x+" ");
        }

    }
}
