import java.util.*;
class Permutations{
 
    static List<String> result = new ArrayList<>();

    private static void permutation(String s,String temp){
        //base
        if(s.isEmpty()){
            result.add(temp);
            
            return;
        }

        //Logic
        for(int i=0;i<s.length();i++){
            //Choose
            String chosenLetter = s.substring(i,i+1);
            s = s.substring(0,i)+s.substring(i+1,s.length());
            temp = temp+ chosenLetter;
            
            permutation(s, temp);
            //unchoose
            temp = temp.substring(0,temp.length()-1);
            s =s.substring(0,i)+chosenLetter+s.substring(i);

        }

    }

   

  



    public static void main(String[] args){
        permutation("ABC", "");
        for(String s:result){
            System.out.println(s);
        }
    }
}