package test2;
import java.util.List;
import java.util.ArrayList;

public class OddEvenMatrix {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int m3[][] = new int[3][3];
	List<Integer> even=new ArrayList<>();
	List<Integer> odd=new ArrayList<>();

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(m1[i][j]%2==0)
					even.add(m1[i][j]);
				else
					odd.add(m1[i][j]);
			}
		}
			System.out.println("Even :");
			for(int i:even)
				System.out.print(i+" ");
			System.out.println();
			System.out.println("Odd :");
			for(int i:odd)
				System.out.print(i+" ");
	
	
	}

}
