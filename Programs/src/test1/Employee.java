package test1;

public class Employee {
	
	public int regno;
	public String name;
	public Employee(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}if(obj==this) {
			return true;
		}
		return this.regno==((Employee)obj).regno;
	}

}
