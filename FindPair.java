package com.greatlearning.findpair;

import java.util.HashSet;
import java.util.Set;

import com.greatlearning.main.BtTree.Node;

public class FindPair {

	public void findpair(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		if(!findpairuntil(root, sum, set)) {
			System.out.println("pair not found");
			
		}

	}

	public boolean findpairuntil(Node root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;
		}
		if

		(findpairuntil(root.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.data)) {
			System.out.println("pair is:"  + root.data +  " and "  + (sum - root.data) );
			return true;
		}

		else

		{
			set.add(root.data);

		}

		return findpairuntil(root.right, sum, set);

	}
}