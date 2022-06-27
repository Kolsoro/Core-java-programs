package LinkedList;

public class CircularLinkedList {

	Node head;
	Node tail;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void add(int data) {
		Node n = new Node(data);
		if (head != null) {
			tail.next = n;
			tail = n;
			n.next = head;
		} else {
			head = tail = n;
			tail.next = head;
		}
	}

	public void display() {

		Node n = head;
		while (n.next != head) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data + " ");
	}

	public int count() {
		int c = 1;
		Node n = head;
		while (n.next != head) {
			n = n.next;
			c++;
		}

		return c;
	}

	public void reverseList(Node n) {
//		Node n=head;
		if (n.next == head)
			System.out.print(n.data + " ");
		else {
			reverseList(n.next);
			System.out.print(n.data + " ");
		}
	}

	public void reverse(int c) {
		Node n = head;
		int count = 1;
		while (count != c) {
			n = n.next;
			count++;
		}
		if (c <= count())
			reverse(c + 1);
		System.out.print(n.data + " ");
	}

	public void deleteFromStart() {
		if (head == null)
			System.out.println("The list is empty");
		else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
		}

	}

	public void deleteFromEnd() {
		Node n = head;
		while (n.next != tail) {
			n = n.next;
		}
		n.next = head;
		tail = n;
	}

	public void deleteFromMiddle() {
		int size = count();
		int c = size % 2 == 0 ? size / 2 : (size + 1) / 2;
		Node n = head;
		while (c > 2) {
			n = n.next;
			c--;
		}
		n.next = n.next.next;
	}

	public int max() {
		Node n = head;
		int max = 0;
		while (n.next != head) {
			if (n.data > max)
				max = n.data;
			n = n.next;
		}
		return max > n.data ? max : n.data;
	}

	public int min() {
		Node n = head;
		int min = head.data;
		while (n.next != head) {
			if (min > n.data)
				min = n.data;
			n = n.next;

		}
		return min < n.data ? min : n.data;
	}

	public void addAtStart(int data) {
		Node n = new Node(data);
		if (head == null)
			head = tail = n;
		else {
			n.next = head;
			tail.next = n;
			head = n;
		}
	}

	public void addAtEnd(int data) {
		Node n = new Node(data);
		if (head == null)
			head = tail = n;
		else {
			tail.next = n;
			tail = n;
			tail.next = head;
		}
	}

	public void addAtMiddle(int data) {
		Node n = new Node(data);
		int size = count();
		int c = size % 2 == 0 ? size / 2 : (size + 1) / 2;
		Node temp = head;
		while (c > 2) {
			temp = temp.next;
			c--;
		}
		n.next = temp.next;
		temp.next = n;

	}

	public void removeDuplicate() {
		int val = 0;
		Node n = head;
		for (int i = 1; i <= count(); i++) {
			val = n.data;
			Node temp = n;
			for (int j = i + 1; j <= count(); j++) {
				if (temp.next.data == val) {
					temp.next = temp.next.next;
				}
				temp = temp.next;
			}
			n = n.next;
		}
	}

	public String search(int data) {
		Node n = head;
		String s = "";
		int c = 1;
		while (n.next != head) {
			if (n.data == data) {
				s += String.valueOf(c) + " ";
			}
			n = n.next;
			c++;
		}
		return s;
	}

	public void sort() {
		Node n = head;
		for (int i = 1; i <= count(); i++) {
			Node temp = n;
			for (int j = i+1; j <= count(); j++) {
				if (n.data > temp.next.data) {
					int x=n.data;
					n.data=temp.next.data;
				    temp.next.data=x;	
				}
				temp = temp.next;
			}
			n = n.next;
		}
	}

	public static void main(String args[]) {
		CircularLinkedList list = new CircularLinkedList();
		list.add(1000);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(200);
		list.add(300);
		list.add(500);
		list.display();
		System.out.println();
//		list.reverse(1);
//		list.deleteFromStart();
		System.out.println(list.count());
		;
		System.out.println();
//		list.deleteFromMiddle();
//		list.deleteFromEnd();
		list.addAtStart(600);
		list.addAtEnd(700);
		list.addAtMiddle(800);
		list.display();
		System.out.println();
//		list.deleteFromEnd();
//		list.removeDuplicate();
//		list.display();
		list.sort();
		list.display();
		System.out.println();
//		System.out.println(list.search(300));
//		System.out.println(list.max());
//		System.out.println(list.min());
//		list.reverseList(list.head);
//		System.out.println(list.count());
	}

}
