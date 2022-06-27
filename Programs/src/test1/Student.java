package test1;

public class Student {

	public int id;
	public String name;
	String course;
    float fee;

     
	
	public Student(int id,String name,String course) {
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	
	public Student(int id, String name, String course, float fee) {
		this(id,name,course);
		this.fee = fee;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	
	
	
}
