package LinkedList;

public class LinkedList3 {

	Node head;
	Node tail;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void addNode(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
		}
	}

	public void display() {
		Node n = head;
		if (head == null)
			System.out.println("The list is empty");
		else {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
		}
	}

	public void reverse(Node current) {
		if (current.next == null) {
			System.out.print(current.data + " ");
		} else {
			reverse(current.next);
			System.out.print(current.data + " ");
		}
	}

	public void deleteFirstNode() {
		if (head == null)
			System.out.println("list is empty");
		else {
			if (head != tail) {
				head = head.next;

			} else {
				head = null;
				tail = null;
			}
		}
	}

	public void deleteFromMiddle(int n) {
		Node temp = head;
		while (n - 1 > 1) {
			if (temp.next == null)
				System.out.println("node doesnt exist ");
			else {
				temp = temp.next;
				n--;
			}
		}
		if (temp.next != null)
			temp.next = temp.next.next;
		else
			System.out.println("Node does not exist");
	}

	public void deletefromEnd() {
		Node temp = head;
		if (head == null)
			System.out.println("List is empty ");
		else if (head == tail && head != null) {
			head = null;
			tail = null;
		} else if (head != tail) {
			while (temp.next != tail) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		}
	}

	public boolean isPalindrone() {
		Node n = head;
		String s = "";
		while (n.next != null) {
			s += String.valueOf(n.data);
			n = n.next;
		}
		s += String.valueOf(n.data);
		StringBuffer b = new StringBuffer(s);
		b = b.reverse();
		return s.equals(toString().valueOf(b));

	}

	public int max() {
		Node n = head;
		int max = 0;
		while (n.next != null) {
			if (n.data > max)
				max = n.data;
			n = n.next;
		}
		max = max > n.data ? max : n.data;
		return max;
	}

	public int min() {
		Node n = head;
		int min = head.data;
		while (n.next != null) {
			if (n.data < min)
				min = n.data;
			n = n.next;
		}
		return min < n.data ? min : n.data;
	}

	public int size() {
		Node n = head;
		int size = 1;
		while (n.next != null) {
			n = n.next;
			size++;
		}
		return size;
	}

	public void insertInMiddle(int data) {
		Node newNode = new Node(data);
		Node node = head;
		int size = size();
		int n = size % 2 == 0 ? size / 2 : (size + 1) / 2;
		while (n - 1 > 0) {
			node = node.next;
			n--;
		}
		Node temp = node.next;
		node.next = newNode;
		newNode.next = temp;
	}

	public void insertAtStart(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public void insertAtLast(int data) {
		Node n = new Node(data);
		if (tail != null) {
			tail.next = n;
			tail = n;
		} else
			head = tail = n;
	}

	public void remopveDuplicate() {
		Node n, temp;
		n = head;
		int val = 0;
		int size = size();
		for (int i = 1; i <= size(); i++) {
			val = n.data;
			temp = n;
			for (int j = i + 1; j <=size(); j++) {
				if (temp.next.data == val) {
//					deleteFromMiddle(j);
					temp.next=temp.next.next;
				}
				temp = temp.next;
			}
			n = n.next;
		}
	}
	
	public int search(int data) {
		Node n=head;
		int num=1;
		while(n.next!=null) {
			num++;
			if(data==n.data)
				return  num;
			n=n.next;
		}
		return 0;
	}

	public static void main(String args[]) {
		LinkedList3 list = new LinkedList3();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(3);
		list.addNode(2);
		list.addNode(1);

		list.display();
		System.out.println();
//		System.out.println(list.min());
		list.insertInMiddle(5);
		list.insertInMiddle(6);
		list.insertAtStart(0);
		list.insertAtStart(9);
		list.insertAtLast(18);
		list.insertAtLast(100);
		list.insertAtLast(100);
//		System.out.println("String is :"+(list.isPalindrone()?" Palindrome":"Not Palindrome"));
//		list.deleteFromMiddle(4);
		// list.reverse(list.head);
//		list.deletefromEnd();
		list.display();

		list.remopveDuplicate();
		System.out.println();
		list.display();
		System.out.println();
		System.out.println(list.search(18));
	}

}
