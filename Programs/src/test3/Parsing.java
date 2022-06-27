package test3;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parsing {

	public static int toDecimal(int n) {
		int val=0;
		int c=0;
		while(n>0) {
			int rem=n%10;
			val+=rem*Math.pow(8, c);
			c++;
			n/=10;
		}
		return val;
	}

	public static void main(String args[]) throws ParseException {

		System.out.println(toDecimal(3553));
		System.out.println(Integer.parseInt("3553",8));
			}

}
