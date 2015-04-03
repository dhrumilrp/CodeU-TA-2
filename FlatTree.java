
public class FlatTree {
		
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

	public static void main(String[] args){
		BinaryTree node = new BinaryTree( new BinaryTree(null, null, "hi")
				, null, "hello");
		System.out.println(node.left);
	}
}
