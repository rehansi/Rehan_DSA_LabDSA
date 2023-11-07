package com.greatlearning.main;

import com.greatlearning.findpair.FindPair;

public class BtTree {
	private static Node root;

	public class Node {
		public int data;
		public Node left;
		public Node right;

		Node(int data) {
			this.data = data;

		}
	}

	public void insert(int val) {
		root = insert(root, val);
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}

		if (value > root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;

	}

	public static void main(String[] args) {
		BtTree bt = new BtTree();
		bt.insert(40);
		bt.insert(20);
		bt.insert(60);
		bt.insert(10);
		bt.insert(40);
		bt.insert(30);
		bt.insert(50);
		bt.insert(70);
		
		FindPair fp = new FindPair();
		fp.findpair( root ,  130);

	}

}
