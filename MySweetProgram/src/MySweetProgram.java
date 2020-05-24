import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter Your Name ");
	
	Scanner in =new Scanner(System.in);
	String S = in.nextLine();
	
	if (S.equals("Celeb")) {
		
		System.out.println("Hey Celeb");
		
	}else if (S.equals("Sally")) {
		System.out.println("Hey Sally");
		
	}else {
		
		System.out.println("You are not welcome here");
	}	
	
	
	int i=0;
	while (i<10) {
		System.out.println("i is: " + i);
		i++;
	}
	in.close();
	}
}
