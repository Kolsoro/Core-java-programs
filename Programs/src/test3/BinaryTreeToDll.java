package test3;

public class BinaryTreeToDll {

	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left=null;
			this.right=null;
		}
	}

	public Node head, tail = null;
	public Node root;

	public void m(Node n) {
		if (n == null)
			return;
		else {
			m(n.left);
			if (head == null)
				head = tail = n;
			else {
				tail.right = n;
				n.left = tail;
				tail = n;
			}
			m(n.right);
		}
	}
	
	public void displayDll() {
		if(head==null)
			System.out.println("list is empty");
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}
	public static void main(String args[]) {
		
		BinaryTreeToDll b=new BinaryTreeToDll();
		b.root=new Node(1);
		b.root.left=new Node(2);
		b.root.right=new Node(3);
		b.root.left.left=new Node(4);
		b.root.left.right=new Node(5);
		b.root.right.left=new Node(6);
		b.root.right.right=new Node(7);
		b.displayDll();
		System.out.println();
		b.m(b.root);
		b.displayDll();
		System.out.println();
	}

}
