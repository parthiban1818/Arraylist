package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {   
	   
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("   !!! WELCOME TO ABC SCHOOL !!!\n");
		boolean b=true;
		while(b) { 
		  System.out.println("press 1 for add new student details");
		  System.out.println("press 2 for all student details");
		  System.out.println("press 3 for a single student details");
		  System.out.println("press 4 for student details from the index value");
		  System.out.println("press 5 for add student details in first position");
		  System.out.println("press 6 for remove element in the index");
		  System.out.println("press 7 for delete all student details ");
		  System.out.println("press 8 for update student details");
		  System.out.println("press 9 for remove student details by ID");
		  System.out.println("press 10 for print by reverse order");
		  System.out.println("press 11 for print by shuffle order");
		  System.out.println("press 12 for swapping the order");
		  System.out.println("press 13 for sort by name");
		  System.out.println("press 14 for extract some details");
		  System.out.println("press 15 for log out");
		  int process=sc.nextInt();
		  switch(process) { 
		  case 1:Insert.insert();break;
		  case 2:Display.allDetails();break;
		  case 3:{
			      int id=sc.nextInt();
			      System.out.println("enter student id");
			      Display.displayById(id);break;
		           }
		  case 4:{ 
			     Display.displayByIndex();break;
		       }
		  case 5:Insert.insertFirst();break;
		  case 6:Remove.removeElement();break;
		  case 7:Remove.removeAll();break;
		  case 8:Update.update();break;
		  case 9: {
			  System.out.println("enter student id");
			  int id=sc.nextInt();
			  Remove.removeById(id);
			  break;
		  } 
		  //case 10:Display.iterate();break;
		  case 10:Insert.reverse();break;
		  case 11:Insert.shuffle();break;
		  case 12:{
			  System.out.println("enter first index");
			  int first=sc.nextInt();
			  System.out.println("enter second index");
			  int second=sc.nextInt();
			  Insert.swap(first, second);
			  break;
		  }
		  case 13:Display.sort();break;
		  case 14:Display.extract();break;
		  case 15:{
		       System.out.println("***YOU ARE LOGGED OUT***");
		       System.out.println("!!!thankyou...visit again!!!");
	           System.exit(0);
	           }
		  default: System.err.println("***WRONG INPUT***\nCHOOSE THE CORRECT ONE\n");
		  }
		} 
	}	
}
