class Solution{
    static int count = 0;
    private static void permuation(String str,boolean[] visited,String temp){
       
        if(temp.length() == 12){
            if(checkValid(temp))
                count++;
        }

        for(int i=0;i<str.length();i++){
            if(visited[i] == false) {
                visited[i] = true;
                temp = temp + str.charAt(i);

                permuation(str,visited,temp);

                temp = temp.substring(0,temp.length()-2);

                visited[i] = false;
            }
        }

    }

    private static boolean checkValid(String temp){
        int[] positions = new int[12];
        int pointer = 0;
        for(int i=0;i<temp.length();i++){
            char c = temp.charAt(i);
            if(c == 'p'){
                pointer = (pointer + 1)%12;
            }
            else if(c == 'd'){
                pointer = (pointer + 10)%12;
            }
            else if(c == 'n'){
                pointer =( pointer + 5)%12;
            }
            if(positions[pointer] == 0){
                positions[pointer] = 1;
            }
            else
                return false;

        }

        return true;
    }

    public static void main(String[] args){
            permuation("ppppddddnnnn",new boolean[12]," ");
            System.out.println(count);
    }
    
}

      

// visited   0   1   2

//           F   F   F

          