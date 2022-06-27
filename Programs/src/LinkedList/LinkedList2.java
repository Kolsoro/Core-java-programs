package LinkedList;

public class LinkedList2 {

	public Node head;
	public Node tail;

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node n = head;
			System.out.println("The Linked list is :");
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
		}
	}

	public int countNodes() {
		int i = 0;
		Node n = head;
		while (n != null) {
			n = n.next;
			i++;
		}
		return i;
	}

	public static void main(String args[]) {
		LinkedList2 list = new LinkedList2();
		list.addNode(100);
		list.addNode(200);
		list.addNode(300);
		list.addNode(400);
		list.display();
		System.out.println();
		System.out.println(list.countNodes());

	}

}
