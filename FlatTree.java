import java.util.ArrayList;


public class FlatTree {
	
	static ArrayList<String> tree = new ArrayList<String>();
	
	static class BinaryTree{
		BinaryTree left;
		BinaryTree right;
		String s;
	
		BinaryTree(BinaryTree l, BinaryTree r, String payload){
			left = l;
			right = r;
			s = payload;
		}
	}
	
	static void flatten (BinaryTree root){
		if(root == null) return;
		if(root.left != null )  flatten(root.left);
		tree.add(root.s);
		if(root.right != null )  flatten(root.right);
	}

	public static void main(String[] args){
		BinaryTree node0 = new BinaryTree(null, null, "Google");
		BinaryTree node1 = new BinaryTree(null, null, "CodeU");
		BinaryTree node2 = new BinaryTree(null, null, "is");
		BinaryTree node3 = new BinaryTree(null, null, "awesome");
		BinaryTree node4 = new BinaryTree(null, null, "woot woot");
		BinaryTree node5 = new BinaryTree(null, null, "summertime");
		BinaryTree node6 = new BinaryTree(null, null, "Dhrumil");
		
		node0.left = node1;
		node0.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		
		flatten(node0);
		
		for(String a : tree){
			System.out.println(a);
		}

	}
}
