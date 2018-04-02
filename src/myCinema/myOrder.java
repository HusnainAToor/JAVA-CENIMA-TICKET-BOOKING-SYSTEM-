package myCinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

// Coding for my Order 
public class myOrder {
     public myOrder() throws IOException { //methode for order 
    	
 		 BufferedReader orderInput=new BufferedReader(new InputStreamReader(System.in));
 		
 //.....................................NameInput....................................................... 
 		 String Name;
		 boolean Namecorrect=true;
		 
		  do {
			       System.out.println("Enter Your Name");
				   Name=orderInput.readLine();
				 
			      if (Name.length()>0&&Name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
				     {
					  Namecorrect= true;
				     }
				  else {
					 Namecorrect=false;
					   }
			 }
		  
	         while (Namecorrect!=true);
		  
//...........................................AgeInput........................................................		
     
		  String Age;
			 boolean Agecorrect=true;
			 
			  do {
				  System.out.println("Enter Your Age");
					 Age=orderInput.readLine();
					 if (Age.length()>0&&Age.matches("^[0-9]*$") )
					 {
						  Agecorrect= true;
					  }
					 else {
						 Agecorrect=false;
						 }
					
				}
		         while (Agecorrect!=true);
			double myAge=Double.parseDouble(Age); 
     
 //.............................................MovieName............................................................
			
			
			 String movieName;
			 boolean movieNamecorrect=true;
			 
			  do {
				       System.out.println("Enter Your Movie Name");
					   movieName=orderInput.readLine();
					 
				      if (movieName.length()>0&&movieName.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
					     {
				    	  movieNamecorrect= true;
					     }
					  else {
						  movieNamecorrect=false;
						   }
				 }
			  
		         while (movieNamecorrect!=true);
			    
			  
//............................................................myTickets.............................................
			  String Tickets;
				 boolean Ticketscorrect=true;
				 
				  do {
					  System.out.println("Enter No: of Tickets");
					  Tickets=orderInput.readLine();
						 if (Tickets.length()>0&&Tickets.matches("^[0-9]*$") )
						 {
							 Ticketscorrect= true;
						  }
						 else {
							 Ticketscorrect=false;
							 }
						
					}
			         while (Ticketscorrect!=true);
				  double myTickets=Double.parseDouble(Tickets); 
			  
//....................................................Confirmation......................................................................
				  System.out.println("Enter 1 to Confirm your Order!");
				String confirm;
				   confirm=orderInput.readLine();
				  if(confirm.equals("1"))   //if confirmed.............................
				  {
					  
					  System.out.println( " ....Thankyou for Order....");
					  int lineNo=0;
						LineNumberReader pre=new LineNumberReader(new FileReader("ORDER.txt"));
						while( pre.readLine() != null){
							lineNo++;
						}
						int OrderNo =lineNo+1;
					   System.out.println("Order No;                         =       "+OrderNo);
					   System.out.println("Name                              =       MR "+Name );
					   System.out.println("Age                               =       "+Age);
					   System.out.println("Movie                             =       "+movieName);
					   System.out.println("Tickets                           =       "+Tickets);
					   System.out.println("Price per ticket                  =       20 EUORO");
					 
					 
				double x,y,z,d,t;	   
					   
					   x=20.0;
					   y=0.6;
					   z=0.4; 
					   d=(myTickets*x);
					   System.out.println("Total Price                       =       "+d+" EUORO");
					   if (myAge>0&myAge<=12){
						   t=(myTickets*x*0.6);
						   System.out.println("Totel Price After 40% Discount    =       "+t+"   EUORO");}
					   else if(myAge>=65){
							   t=(myTickets*x*0.8);
						   System.out.println("Totel Price After 20% Discount    =       "+t+"   EUORO");}
					   else{
							   t=(myTickets*x);
							   System.out.println("Totel Price                   =       "+t+"   EUORO");
						   }
					  
	//..................................................print in TXT file....................................................................
					   PrintWriter TotalSale = new PrintWriter(new FileWriter("ORDERNo1.txt",true));
						  TotalSale.println(t);
						  TotalSale.close();
					   
					      PrintWriter writer = new PrintWriter(new FileWriter("ORDER.txt",true));
					      writer.println("Order No; = "+OrderNo+"  Name = MR "+Name+" , Age = "+Age+" , Movie = "+movieName+" , Tickets = "+myTickets+" , Price per ticket = 20 EUORO , Total Price = "+d+"EUORO , Total Price = "+d+"EUORO and Totel Price = "+t+" EUORO" );
					     
					     
						  
						  writer.close();
						  
					   }
					   
					   
					   
					   
					  else {   //if donot confirm................................................................................
						  System.out.println("Sorry You have not cofirmed your order");  
					  }
					  
					  
					  
				  }
     }
     

