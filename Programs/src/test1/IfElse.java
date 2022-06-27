package test1;

public class IfElse {
	
	public static void main(String []args) {
		String adress="Rohtak,India";
		
		if(adress.endsWith("India")) {
			System.out.println("You live in india");
			if(adress.contains("Meerut")) {
				System.out.println("Your city is meerut");}
				else if(adress.contains("Noida")) {
					System.out.println("Your city is Noida");
				}else {
					System.out.println("Your city is "+adress.split(",")[0]);
				}
			
		}
		else {
			System.out.println("You dont live in India ");
		}
	}

}
