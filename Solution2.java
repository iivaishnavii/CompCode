class Solution2{


    static int i=0,j=0;


    private static void place(int r,int c,int n,String input){


      //  int[][] dirs  = {{0,1},{1,0},{0,-1},{-1,0}};


        for(int i=0;i<input.length();i++){

            char temp = input.charAt(i);
            
            if(temp == 'U'){
                int newrow = r -1;
                int newcol = c;
                  if(newrow >=0 && newrow <n && newcol >=0 && newcol <n){
                    r = newrow;
                    c = newcol;
                 }
                
            }
            else if(temp == 'D'){
                int newrow = r +1;
                int newcol = c;
                  if(newrow >=0 && newrow <n && newcol >=0 && newcol <n){
                    r = newrow;
                    c = newcol;
                 }
                
            }
            else if(temp == 'R'){
                int newrow = r ;
                int newcol = c + 1;
              
                r = newrow;
                newcol = newcol %n;
            }
            else if(temp == 'L'){
                int newrow = r ;
                int newcol = c - 1;
              
                r = newrow;
                newcol = newcol %n;
            }
          
        }

       System.out.println("Row"+r);
       System.out.println("Column"+c);

    }

    public static void main(String[] args){
        place(1,2,3,"RUR");
        
    }
    
}