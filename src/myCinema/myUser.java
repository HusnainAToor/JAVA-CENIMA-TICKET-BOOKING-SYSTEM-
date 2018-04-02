package myCinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myUser {
	public myUser() throws IOException{
		
		
		
		
		System.out.println("ENTER 'A' FORMAKE A NEW ORDER");

		System.out.println("ENTER 'B' VIEW MOVIES LIST");

		System.out.println("ENTER 'C' VIEW PREVIOUS ORDER");

		System.out.println("ENTER 'D' EXIT THE PROGRAME");
		
		
		

		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String ChoiceUser;
		ChoiceUser=input.readLine();
		
		if(ChoiceUser.equals("A")||ChoiceUser.equals("B")||ChoiceUser.equals("C")||ChoiceUser.equals("D")){
		switch (ChoiceUser)

		 

		{
		case "A":
		
		new	myOrder();
		new returnMenu();
		break;
		case "B":

		new myMoviesList();
		new returnMenu();
		break;
		
		
		
//...........................................VIEW PREVIOUS  ORDER BY USER..........................................OPEN
		case "C":

			
		
			BufferedReader orderInput=new BufferedReader(new InputStreamReader(System.in));
			   String order;
			   
				 
				
					
					
					
					 boolean Agecorrect=true;
					 
					  do {
						  System.out.println("Enter Your Order NO: to View your Order");
						  order=orderInput.readLine();
							 if (order.length()>0&&order.matches("^[0-9]*$") )
							 {
								  Agecorrect= true;
							  }
							 else {
								 Agecorrect=false;
								 }
							
						}
				         while (Agecorrect!=true);
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
					}
					
			
			  new returnMenu();
			break;
			
//................................................................................C-CLOSED........................................
			
			
			case "D":
				System.exit(0);
				break;	
		}

	}

		else{
			System.out.println("Sorry! You Cannot enter One of Right Opionz");
			new returnMenu();
		}
		
		
		
		
	}

}
