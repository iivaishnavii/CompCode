//2.14.11   2.12
import java.util.*;
class SortReleaseVersion{
    private static int compareNumbers(String str1,String str2){
        
        String s1[] = str1.split("\\.");
        System.out.println(Arrays.toString(s1));
        String s2[] = str2.split("\\.");
        System.out.println(Arrays.toString(s2));
        int size = s1.length < s2.length ? s1.length : s2.length;

        for(int i=0;i<size;i++){

            int num1= Integer.valueOf(s1[i]);
            int num2= Integer.valueOf(s2[i]);

            if(num1 > num2)
                return 1;
            else if(num2 > num1)
                return -1;
        }
       
        return 0;


    }
    public static void main(String[] args){
            String str1 = "2.10";
            String str2 = "2.11.01";

            System.out.println(compareNumbers(str1,str2));
    }
}