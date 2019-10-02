/**
https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class serializeBST {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        TreeNode curr;
        while(!q.isEmpty()){
            curr = q.remove();
            if(curr == null){
                sb.append("null ");
                continue;
            }
                sb.append(curr.val + " ");
                q.add(curr.left);
                q.add(curr.right);
            
        }
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0 || data.equals("null")) return null;
        String [] arr = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for(int i = 1 ; i < arr.length; i++){
            TreeNode curr = q.remove();
            if(!arr[i].equals("null")){
                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                curr.left = left;
                q.add(left);
            }
             if(!arr[++i].equals("null")){
                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                curr.right = right;
                 q.add(right);
            }
            
        }
        return root;

        
    }
}

// Your Codec object will be instantiated and called as such:
// serializeBST s = new serializeBST();
// s.deserialize(s.serialize(root));
