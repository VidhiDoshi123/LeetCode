/*
Problem Statement:
You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.
Problem Link:
     Construct String from Binary Tree: https://leetcode.com/problems/construct-string-from-binary-tree/description/
Solution:
    
Author:
    Vidhi Doshi
    doshividhi013@gmail.com
    https://github.com/VidhiDoshi123
    https://www.linkedin.com/in/vidhi-doshi-269121138/
 */
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public String tree2str(TreeNode t) {
        if(t==null)
        {
            return "";
        }
        StringBuilder s=new StringBuilder();
        Stack<TreeNode> s1=new Stack();
        s1.push(t);
        Set<TreeNode> set=new HashSet();
        while(!s1.isEmpty())
        {
            t=s1.peek();
            if(set.contains(t))
            {
                s1.pop();
                s.append(")");
            }
            else
            {
                set.add(t);
                s.append("("+t.val);
                if(t.left==null && t.right!=null)
                {
                    s.append("()");
                }
                if(t.right!=null)
                    s1.push(t.right);
                if(t.left!=null)
                {
                    s1.push(t.left);
                }
            }
        }
        return s.substring(1,s.length()-1);
        
    }
}