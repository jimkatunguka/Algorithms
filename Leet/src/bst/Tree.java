package bst;

public class Tree {
    Node root;

    public Tree (Node root){this.root = root;}

    public boolean findNode(int value){
        int current_value = root.val;
        while(root != null){
            if(value < root.val)

        }
    }

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(){}
        public Node(int val){this.val = val;}
        public Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
