class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
class HelloWorld  
{ 
     Node root; 
   
    /* Compute the "maxDepth" of a tree -- the number of  
       nodes along the longest path from the root node  
       down to the farthest leaf node.*/
    int maxDepth(Node node)  
    { 
		//System.out.println("Processing"+node.data);
	   if(node == null)
		return 0;
	  else
		return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    } 
       
    /* Driver program to test above functions */
    public static void main(String[] args)  
    { 
        HelloWorld tree = new HelloWorld(); 
   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
   
        System.out.println("Height of tree is : " +  
                                      tree.maxDepth(tree.root)); 
    } 
} 
  
