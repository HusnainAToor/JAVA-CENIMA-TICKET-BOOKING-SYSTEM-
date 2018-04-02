package myCinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myMoviesList{
	public myMoviesList() throws IOException {
	System.out.println("**** The List Of Movies Launched**** ");
	  
	  BufferedReader input1=new BufferedReader(new FileReader("MOVIESLIST1.txt"));
	  String movie1 = null;
		while((movie1=input1.readLine())!=null){
	 
			System.out.println(movie1);
	  }
	
	  
	  }
	  
	  }

