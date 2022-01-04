package binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> arraylist = new ArrayList<>();

        if(root == null){
            return arraylist;
        }

        TreeNode current = root;

        while(current!= null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            arraylist.add(current.val);
            current = current.right;
        }
        return  arraylist;
    }
}
