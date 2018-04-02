package myCinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class myAdmin {
public myAdmin() throws IOException {
		
		System.out.println("Enter 'A' for View Orders & 'B' for Adding Movies Lists & 'C'for View Totel Sale ");
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String choice;
		choice=input.readLine();
		switch (choice)

		 

		{
		case "A":
		
		informationAdmin1();
		new returnMenu();
		break;
		case "B":

		informationAdmin2();
		new returnMenu();
		break;
		case "C":

			informationAdmin3();
			new returnMenu();
			break;
		}
}
		public void  informationAdmin1() throws IOException {
			
		
			BufferedReader orderInput=new BufferedReader(new InputStreamReader(System.in));
			   String order;
			  
			   
			  
				 boolean Agecorrect=true;
				 
				  do {
					  System.out.println("Enter order no; to View Specific Order OR Enter A for view All Orders");
					  order=orderInput.readLine();
						 if (order.length()>0&&order.matches("^[0-9]*$")||order.equals("A") )
						 {
							  Agecorrect= true;
						  }
						 else {
							 Agecorrect=false;
							 }
						
					}
			         while (Agecorrect!=true);
				 
			   
			   
			   
			   
			   
			   
			   
			   
	//..............................................................VIEW ALL ORDERS.......................................................
			  
			  if(order.equals("A")){
				  String AllOrder = null;
					BufferedReader pre=new BufferedReader(new FileReader("ORDER.txt"));
				  while((AllOrder=pre.readLine())!=null){
					  
				  System.out.println(AllOrder);}
			  }
		//.....................................................................VIEW ORDER BY ORDER NO;..........................................	  
			  else{
				  
		
				  int orderNo=Integer.parseInt(order);
			System.out.println("view order lists");
			String OrderNumberDisplay;
			int lineNo;
			BufferedReader pre=new BufferedReader(new FileReader("ORDER.txt"));
			
			
			
			for (lineNo = 1; lineNo < 1000; lineNo++) {
				if (lineNo ==  orderNo) {
					
					OrderNumberDisplay= pre.readLine();
					System.out.println(OrderNumberDisplay);
					
				} else
					pre.readLine();
			  
			}}
			
			
		}
		
//..................................................................................Add Movie List.........................open......
		public void informationAdmin2() throws IOException{
			System.out.println("Add new Movies in Movies List");
			
			try {
				 PrintWriter writer= new PrintWriter(new FileWriter("MOVIESLIST1.txt"));

				BufferedReader moviesslist1=new BufferedReader(new InputStreamReader(System.in));
	     String movie1,movie2,movie3,movie4,movie5;
	     movie1=moviesslist1.readLine();
	     movie2=moviesslist1.readLine();
	     movie3=moviesslist1.readLine();
	     movie4=moviesslist1.readLine();
	     movie5=moviesslist1.readLine();
	     
	     
	     writer.println(movie1);
	     writer.println(movie2);
	     writer.println(movie3);
	     writer.println(movie4);
	     writer.println(movie5);
		writer.close();
		    
			} catch (IOException e) {
				e.printStackTrace();
			}
				System.out.println("You can only display 5 movies ...Thankyou");
			}
		
	
		//..................................................................................Add Movie List.........................close......
		private void informationAdmin3() {
			// TODO Auto-generated method stub
			
			 try{
		            BufferedReader reader = new BufferedReader(new FileReader("ORDERNo1.txt"));
		           
		            String line;
		            double sum = 0;
		            while ((line = reader.readLine()) != null) {
		            double number =Double.parseDouble(line);
		             sum= sum +number;
		            }
		            System.out.println("...........................");
		            System.out.println("TOTAL SALE   =   "+sum+" Euro");
		            System.out.println("...........................");
		            
		            reader.close();
		        }catch(Exception exeption){
		            System.out.println("Error");
		                      
		        }   
			
			
			
			
			
		            
		       
		           
		       
			
			
		}
		}
		


