package test1;

public class Rectangle {
	int length;
	int width;
	
	public void insert(int l,int w) {
		length=l;
		width=w;
	}
	public void area() {
		System.out.println(length*width);
	}

}
