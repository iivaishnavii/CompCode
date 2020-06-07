import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CloneGraph{
    static HashMap<Integer, ArrayList<Node>>  map = new HashMap<>();
    static HashMap<Integer, ArrayList<Node>>  deepCopyMap = new HashMap<>();

    class Node{
        int val;
        Arraylist<Node> neighbors;
    
        private Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
        // private ArrayList<Node> getNeighbors(int ){
        //     return this.neighbors;
        // }
    }

    private static void createAdjacencyList(int val, ArrayList<Node> neighbors){
        if(!map.containsKey(val)){
            map.put(val,neighbors);
        }
    }


    //Old
    //1 - [2,3,4]



    //New
    //1 - [2',3',4']
    //2' - []
    //3'  - [] 
    private static Node recreateGraph(Node nee){
        Node root = nee;


        for(Map.Entry<Integer,ArrayList<Node>> entry : map.entrySet()){

            if(!deepCopyMap.contains(entry.Key())){
                Node newroot = new Node(n.val,new ArrayList<>());
                deepCopyMap.put(newroot.key,new ArrayList<>());

                //Get current neighbors of node
                ArrayList<Node> nbs = entry.getValue();

                //Iterate through neighbors and create new nodes
                for(Node n : nbs){

                    //Create New Node
                    Node newn = new Node(n.val,new ArrayList<>());
                    //Attaches a new copy of the node in deepcopy hm.
                    deepCopyMap.get(newroot.key).add(newn);
                    //Track the new nodes in a hashmap
                    deepCopyMap.put(newn.val,new ArrayList<>());
                }

                
            }
            else{

            }
       
        }

    }


    public static void main(String[] args){
        // Node 1     Node node = val 1 neighbors[]
        ArrayList<Node> neighbors = node.neighbors;
        createAdjacencyList(node.val,node,neighbors);

        for(Map.Entry<Integer,ArrayList<Node>> entry : map.entrySet()){
            ArrayList<Node> nbs = entry.getValue();
            for(Node neighbor : nbs){
                ArrayList<Node> newneighbors = neighbor.val;
                createAdjacencyList(neighbor.val,newneighbors);
            }
        }

        recreateGraph(node);
        
    }
}