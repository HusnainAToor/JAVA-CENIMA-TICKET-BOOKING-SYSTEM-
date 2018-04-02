package myCinema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class returnMenu {
public returnMenu() throws IOException {
		
		System.out.println("ENTER 'N' EXIT THE PROGRAME");
		
		
		

		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String choice;
		choice=input.readLine();
		switch (choice)

		 

		{
		case "N":
		
		new	myAdminUser();
		
		
		
		
		
	}}

}
