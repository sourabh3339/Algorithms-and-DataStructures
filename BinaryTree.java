
public class BinaryTree {

	class Node{
		int data;
		Node right;
		Node left;
	}
	
	void Add(Node node, int value){
		if(value > node.data){
			node.right=new Node();
			node.right.data=value;
		} else{
			node.left=new Node();
			node.left.data=value;
		}
	}
	
	void traverse(Node root, int value){
		if(value > root.data){
			if(root.right!=null){
				traverse(root.right,value);
			}else{
				Add(root,value);
			}
		} else{
			if(root.left!=null){
				traverse(root.left,value);
			}else{
				Add(root,value);
			}
		}
	
	}
	
	public static void main(String[] args) {
		int arr[] = {100,99,101,140,130,141,143};	
		
		BinaryTree binarytree = new BinaryTree();
		Node node =binarytree.new Node();
		node.data =123;
		for(int value : arr){
			binarytree.traverse(node,value);	
		}
		System.out.println(node);	
	}
	
}
