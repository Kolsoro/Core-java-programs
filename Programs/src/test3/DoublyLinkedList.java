package test3;

public class DoublyLinkedList {

	Node head;
	Node tail;

	public static class Node {
		int data;
		Node pre;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void add(int data) {
		Node n = new Node(data);
		if (head == null)
			head = tail = n;
		else {
			tail.next = n;
			n.pre = tail;
			tail = n;
		}
	}

	public int count() {
		Node n = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

	public void display() {
		Node n = head;
		if (n == null)
			System.out.println("The list is empty ");
		else {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();
		}

	}

	public void reverseDisplay() {
		Node n = tail;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.pre;
		}
		System.out.println();
	}

	public void reverse() {
		if (head == null || head == tail)
			return;
		else {
			Node n = head, temp = null;
			while (n != null) {
				temp = n.next;
				n.next = n.pre;
				n.pre = temp;
				n = n.pre;
			}
			temp = head;
			head = tail;
			tail = temp;
		}

	}

	public void deleteFirstNode() {
		if (head == null)
			return;
		if (head == tail)
			head = tail = null;
		else {
			head.next.pre = null;
			head = head.next;
		}
	}

	public void deleteLastNode() {
		if (head == null)
			return;
		if (head == tail)
			head = tail = null;
		else {
			tail = tail.pre;
			tail.next = null;
		}
	}

	public void deleteFromMiddle() {
		int size = count() % 2 == 0 ? count() / 2 : (count() + 1) / 2;
		if (head == null || head == tail) {
			head = tail = null;
			return;
		}
		Node n = head;
		while (size > 1) {
			n = n.next;
			size--;
		}
		n.pre.next = n.next;
		n.next.pre = n.pre;

	}

	public int max() {
		int max = 0;
		Node n = head;
		while (n != null) {
			if (max < n.data)
				max = n.data;
			n = n.next;
		}
		return max;
	}

	public int min() {
		int min = head.data;
		Node n = head;
		while (n != null) {
			if (min > n.data)
				min = n.data;
			n = n.next;

		}
		return min;
	}

	public void insertAtStart(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
			return;
		}
		n.next = head;
		head.pre = n;
		head = n;

	}

	public void insertAtEnd(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
			return;
		}
		tail.next = n;
		n.pre = tail;
		tail = n;

	}

	public void insertAtMiddle(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
			return;
		}
		Node t = head;
		int mid = count() % 2 == 0 ? count() / 2 : (count() + 1) / 2;
		while (mid > 1) {
			t = t.next;
			mid--;
		}
		n.next = t.next;
		n.pre = t;
		t.next.pre = n;
		t.next = n;
	}

	public void removeDuplicates() {
		Node n = head;
		int val = 0;
		while (n != null) {
			Node temp = n.next;
			val = n.data;
			while (temp != null) {
				if (temp.data == val) {
					temp.next.pre = temp.pre;
					temp.pre.next = temp.next;
				}
				temp = temp.next;
			}
			n = n.next;
		}
	}

	public void NRotate(int n) {
		while (n > 0) {
			head.pre = tail;
			tail.pre.next = null;
			tail.next = head;
			head = tail;
			tail = head.pre;
			head.pre = null;
			n--;
		}
	}

	public void search(int i) {
		Node n = head;
		String s = "";
		int count = 1;
		while (n != null) {
			if (n.data == i) {
				s += String.valueOf(count) + " ";
			}
			count++;
			n = n.next;
		}
		if (!s.equals("")) {
			System.out.println("element found at these positions : " + s);
		} else
			System.out.println("element not present in the list");
	}

	public void sort() {
		Node x = head;
		while (x != null) {
			Node y = x.next;
			while (y != null) {
				if (x.data > y.data) {
					int data = x.data;
					x.data = y.data;
					y.data = data;
				}
				y = y.next;
			}
			x = x.next;
		}

	}

	public static void main(String args[]) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(2);
		d.add(1);
		d.add(4);
//		System.out.println(d.tail.next);	
//		d.display();
//		d.reverseDisplay();
//		d.reverse();
//		d.deleteFirstNode();
//		d.deleteLastNode();
//		d.deleteFromMiddle();
//		System.out.println(d.max());
//		System.out.println(d.min());
		d.insertAtStart(6);
		d.insertAtStart(3);
		d.insertAtEnd(7);
		d.insertAtMiddle(8);
		d.insertAtMiddle(9);
//		d.display();
//		d.removeDuplicates();
		d.sort();
		d.display();
//		d.search(2);
//		d.NRotate(2);
//		d.display();
	}

}
