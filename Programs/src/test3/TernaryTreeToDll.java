package test3;

public class TernaryTreeToDll {

	public static class Node {
		int data;
		Node left;
		Node right;
		Node middle;

		Node(int data) {
			this.data = data;
		}
	}

	public Node head, tail = null;
	public Node root;

	public void m(Node n) {
		if (n == null)
			return;
		Node left = n.left;
		Node middle = n.middle;
		Node right = n.right;
		if (head == null) {
			head = tail = n;
			head.left = null;
			n.middle = null;
			tail.right = null;
		} else {
			tail.right = n;
			n.left = tail;
			n.middle = null;
			tail = n;
			tail.right = null;
		}
		m(left);
		m(middle);
		m(right);
	}

	public void display() {
		if (head == null)
			System.out.println("List is empty ");
		else {
			Node n = head;
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.right;
			}
		}
	}

	public static void main(String args[]) {
		TernaryTreeToDll t = new TernaryTreeToDll();
		t.root = new Node(5);
		t.root.left = new Node(10);
		t.root.middle = new Node(12);
		t.root.right = new Node(15);
		t.root.left.left = new Node(20);
		t.root.left.middle = new Node(40);
		t.root.left.right = new Node(50);
		t.root.middle.left = new Node(24);
		t.root.middle.middle = new Node(36);
		t.root.middle.right = new Node(48);
		t.root.right.left = new Node(30);
		t.root.right.middle = new Node(45);
		t.root.right.right = new Node(60);

		t.display();
		System.out.println();
		t.m(t.root);
		t.display();
		System.out.println();

	}

}
