package myCinema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class myAdminUser {
	
	
	
	public  myAdminUser() throws IOException {
		
		System.out.println("........*****************.........");
		System.out.println("........*****WELCOME*****.........");
		System.out.println("........*****************.........");
		
		System.out.println("");
		System.out.println("***Who Are You????***");
		
		
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String choice;
		
		 boolean correct=true;
		 
		  do {
			  System.out.println("Enter 'A' for Admin & 'U' for User ");
				 choice=input.readLine();
				 if (choice.length()>0&&choice.equals("A")||choice.equals("U") )
				 {
					  correct= true;
				  }
				 else {
					 correct=false;
					 }
				
			}
	         while (correct!=true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		switch (choice)

		 

		{
		case "A":
		
		new	myAdmin();
		break;
		case "U":

		new myUser();
		break;
		}
	}
}
