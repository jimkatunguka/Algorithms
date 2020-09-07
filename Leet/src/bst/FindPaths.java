package bst;

import java.util.ArrayList;
import java.util.List;

public class FindPaths {
    public List<String> findTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();
        if(root == null) return result;

        String current_path = Integer.toString(root.val);
        if(root.left == null && root.right == null) result.add(current_path);

        if(root.left != null) dfs(root.left, current_path, result);
        if(root.right != null) dfs(root.right, current_path, result);


        return result;
    }

    //Depth first search.
    public void dfs(TreeNode node, String current_path, List<String> result){
        current_path += "->" + node.val;

        if(node.right == null && node.left == null) result.add(current_path);
        if(node.left != null) dfs(node.left, current_path, result);
        if(node.right != null) dfs(node.right, current_path, result);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode (int val){ this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
