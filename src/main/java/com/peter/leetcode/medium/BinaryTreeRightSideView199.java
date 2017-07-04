/*
 * 
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].


 */
package com.peter.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199 {

	public static class Solution {
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
	        searchNode(root, result, 0);
	        return result;
	    }
	    
	    public void searchNode(TreeNode curr, List<Integer> result, int depth){
	        if(curr == null ){
	            return;
	        }
	        
	        if(depth == result.size()){
	            result.add(curr.val);
	        }
	        
	        searchNode(curr.right, result, depth+1);
	        searchNode(curr.left, result, depth+1);
	    }
	    
	}

	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
}

