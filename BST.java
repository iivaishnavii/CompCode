
class BST{
    static int[] inorder_arr = new int[100];
    static int index = 0;
    static int count = 0;
    static class Node{
        int val;
        Node left,right;
        public Node(int v,Node l,Node r){
            this.val = v;
            this.left = l;
            this.right = r;
        }
    }

    private static void getCount(Node root,int low,int high){
        // if(root == null)
        //     return;
        // inorder(root.left);
        // inorder_arr[index] = root.val;
        // index++;
        // inorder(root.right);

        //Base Case
        if(root == null )
            return;

        //Logic
        if(root.val >= low && root.val <=high){
            count++;
            getCount(root.left,low,high);
            getCount(root.right,low,high);
        }
        else{
            if(root.val < low){
                getCount(root.right,low,high);
            }
            else if(root.val > high){
                getCount(root.left,low,high);
            }
            
        }

    }

    private static int findCount(int low,int high){
        int count = 0;
        for(int i=0;i<inorder_arr.length;i++){
            if(inorder_arr[i]>=low && inorder_arr[i]<=high)
                count++;
        }
        return count;
    }
    public static void main(String[] args){

        Node two = new Node(2,null,null);
        Node fifteen = new Node(15,null,null);
        Node thirty = new Node(30,null,null);
       
        Node five = new Node(5,two,null);
        Node twenty = new Node(20,fifteen,thirty);
        Node ten = new Node(10,five,twenty);

        int low = 5;
        int high = 30;
        //inorder(ten);

        getCount(ten,low,high);
        System.out.println(count);


    }
}