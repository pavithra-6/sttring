package sumave1;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
	String s;
	System.out.println("enter the string");
	Scanner b=new Scanner(System.in);
	s=b.nextLine();
	switch(s){
	case "mon":
		System.out.println("true");
		break;
	case "tue":
		System.out.println("true");
		break;
	case "wed":
		System.out.println("true");
		
		break;
	case "thu":
		System.out.println("true");
		break;
	case "fri":
		System.out.println("true");
		break;
	case "sat":
		System.out.println("true");
		break;
	case "a":
		System.out.println("true");
		break;
	case "sun":
		System.out.println("flase");
		break;
		default:
			System.out.println("null");
	}
	}
	}


