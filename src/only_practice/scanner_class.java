package only_practice;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		// getting user input in java
		Scanner z=new Scanner(System.in);
	    System.out.println("enter name");
	    String name=z.next();
	    System.out.println("enter age");
        int age=z.nextInt();
        System.out.println("enter phone no.");
        long phone=z.nextLong();
        System.out.println("enter your gender");
        char gen=z.next().charAt(0);
        
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("phone no.="+phone);
        System.out.println("gender="+gen);
        

	}

}
